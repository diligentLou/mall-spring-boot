package com.lcy.mall.service.impl;

import com.github.pagehelper.util.StringUtil;
import com.lcy.mall.common.CommonResult;
import com.lcy.mall.service.RedisService;
import com.lcy.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * @description:
 * @author:lcy
 * @createTime:2020/7/16 22:36
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private RedisService redisService;

    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;

    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;


    @Override
    public CommonResult generateAuthCode(String telephone) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE+telephone, stringBuilder.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return CommonResult.success(stringBuilder.toString());
    }

    @Override
    public CommonResult verifyAuthCode(String telephone, String authcode) {
        if (StringUtils.isEmpty(authcode)) {
            return CommonResult.failed("请输入验证码");
        }
        String realAuthCode  = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE+telephone);
        boolean result = authcode.equals(realAuthCode);
        if (result) {
            return CommonResult.success(null,"验证码校验成功");
        } else {
            return CommonResult.failed("验证码不正确");
        }
    }
}

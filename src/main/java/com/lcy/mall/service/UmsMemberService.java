package com.lcy.mall.service;

import com.lcy.mall.common.CommonResult;

/**
 * @description:会员管理service
 * @author:lcy
 * @createTime:2020/7/16 22:34
 */
public interface UmsMemberService {


    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机是否匹配
     * @param telephone
     * @param authcode
     * @return
     */
    CommonResult verifyAuthCode(String telephone,String authcode);
}

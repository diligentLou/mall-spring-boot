package com.lcy.mall.service;

import com.lcy.mall.common.api.CommonResult;
import com.lcy.mall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:前台订单管理Service
 * @author:lcy
 * @createTime:2020/7/23 21:03
 */
public interface OmsPortalOrderService {


    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}

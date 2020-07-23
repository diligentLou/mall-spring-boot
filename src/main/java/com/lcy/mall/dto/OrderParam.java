package com.lcy.mall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @description:生成订单时传入的参数
 * @author:lcy
 * @createTime:2020/7/23 21:04
 */
@Getter
@Setter
public class OrderParam {

    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}

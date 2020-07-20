package com.lcy.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:MyBatis配置类
 * @author:lcy
 * @createTime:2020/7/14 22:18
 */
@Configuration
@MapperScan({"com.lcy.mall.mbg.mapper","com.lcy.mall.dao"})
public class MyBatisConfig {
}

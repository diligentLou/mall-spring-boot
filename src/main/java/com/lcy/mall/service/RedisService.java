package com.lcy.mall.service;

/**
 * @description:redis操作Service，对象和数组都以json形式存储
 * @author:lcy
 * @createTime:2020/7/16 22:18
 */
public interface RedisService {

    /**
     * 存储数据
     * @param key
     * @param value
     */
    void set(String key,String value);

    /**
     * 获取数据
     * @param key
     * @return
     */
    String get(String key);


    /**
     * 设置超时时间
     * @param key
     * @param expire
     * @return
     */
    boolean expire(String key,long expire);

    /**
     * 删除数据
     * @param key
     */
    void remove(String key);

    /**
     * 自增操作
     * @param key
     * @param delta
     * @return
     */
    Long increment(String key,long delta);

}

package com.lcy.mall.dao;

import com.lcy.mall.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:搜索系统中的商品管理自定义Dao
 * @author:lcy
 * @createTime:2020/7/20 22:11
 */
public interface EsProductDao {

    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}

package com.lcy.mall.dao;

import com.lcy.mall.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @description:后台用户与角色管理自定义Dao
 * @author:lcy
 * @createTime:2020/7/19 11:40
 */
public interface UmsAdminRoleRelationDao {

    /**
     *获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}

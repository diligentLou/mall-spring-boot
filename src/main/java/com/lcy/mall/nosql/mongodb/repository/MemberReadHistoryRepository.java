package com.lcy.mall.nosql.mongodb.repository;

import com.lcy.mall.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @description:会员商品浏览历史Repository
 * @author:lcy
 * @createTime:2020/7/21 21:32
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {

    /**
     * 根据会员id按时间倒序获取浏览记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}

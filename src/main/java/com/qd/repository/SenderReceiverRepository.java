package com.qd.repository;

import com.qd.model.SenderReceiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface SenderReceiverRepository extends JpaRepository<SenderReceiver, Integer> {

    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("select sr from SenderReceiver sr where sr.id =:qId")
    public List<SenderReceiver> selectSenderReceiver(@Param("qId") String id);

}

package com.yh.b2b.mall.dao;

import com.yh.b2b.mall.model.CustomerCreditPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerCreditMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerCreditPo record);

    int insertSelective(CustomerCreditPo record);

    CustomerCreditPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerCreditPo record);

    int updateByPrimaryKey(CustomerCreditPo record);

    List<CustomerCreditPo> selectByCodes(@Param("sapCusCodes") List<String> sapCusCodes);

    void batchInsert(@Param("credits") List<CustomerCreditPo> credits23);

    int test11();
}
package com.yh.b2b.mall.dao;


import com.yh.b2b.mall.model.LogisticsCompanyDcPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogisticsCompanyDcMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LogisticsCompanyDcPo record);

    int insertSelective(LogisticsCompanyDcPo record);

    LogisticsCompanyDcPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LogisticsCompanyDcPo record);

    int updateByPrimaryKey(LogisticsCompanyDcPo record);

    void deleteByLogisticsCode(@Param("logisticsCode") String logisticsCode);

    void batchInsert(@Param("logisticsCompanyDcPos") List<LogisticsCompanyDcPo> logisticsCompanyDcPos);

    List<LogisticsCompanyDcPo> selectByLogisticsCodes(@Param("logisticsCodes") List<String> logisticsCodes);
}
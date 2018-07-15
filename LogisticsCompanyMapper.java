package com.yh.b2b.mall.dao;

import com.yh.b2b.mall.dto.LogisticsCompanyQo;
import com.yh.b2b.mall.model.LogisticsCompanyPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogisticsCompanyMapper {
    int deleteByPrimaryKey(Long id);

    Long insert(LogisticsCompanyPo record);

    int insertSelective(LogisticsCompanyPo record);

    LogisticsCompanyPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LogisticsCompanyPo record);

    int updateByPrimaryKey(LogisticsCompanyPo record);

    List<LogisticsCompanyPo> select(@Param("search") LogisticsCompanyQo search, int i, int pageSize);

    int countSelect(@Param("search") LogisticsCompanyQo searchDto);

    List<LogisticsCompanyPo> selectByLogisticsCodeIn(@Param("codes") List<String> codes);

    void updateStationOnlineByLogisticsCodes(@Param("codes") List<String> codes, @Param("online") boolean online, @Param("updatedBy") String updatedBy);
}
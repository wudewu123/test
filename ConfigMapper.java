package com.yh.b2b.mall.dao;

import com.yh.b2b.mall.common.enums.ConfigTypeEnum;
import com.yh.b2b.mall.dto.ConfigQo;
import com.yh.b2b.mall.model.ConfigPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ConfigPo record);

    int insertSelective(ConfigPo record);

    ConfigPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ConfigPo record);

    int updateByPrimaryKey(ConfigPo record);

    //custom

    List<ConfigPo> selectList(@Param("condition") ConfigQo configQo);

    int selectCount(@Param("condition") ConfigQo configQo);

    ConfigPo selectByCode(@Param("configType") ConfigTypeEnum configType, @Param("code") String code);

    void insertOrUpdateList(@Param("list") List<ConfigPo> list);

    List<ConfigPo> selectByConfigType(@Param("configType") ConfigTypeEnum configType);
}
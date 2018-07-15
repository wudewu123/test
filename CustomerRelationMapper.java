package com.yh.b2b.mall.dao;

import com.yh.b2b.mall.dto.CustomerRelationPageQo;
import com.yh.b2b.mall.model.CustomerRelationPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerRelationPo record);

    int insertSelective(CustomerRelationPo record);

    CustomerRelationPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerRelationPo record);

    int updateByPrimaryKey(CustomerRelationPo record);

    //custom

    List<CustomerRelationPo> selectAgreementDcs(@Param("sapMerchantCodes") List<String> sapMerchantCodes, @Param("agreementDcCodes") List<String> agreementDcCodes);

    List<CustomerRelationPo> selectInventoryDcs(@Param("sapMerchantCodes") List<String> sapMerchantCodes, @Param("inventoryDcCodes") List<String> inventoryDcCodes);

    List<CustomerRelationPo> selectSapCusCodes(@Param("sapMerchantCodes") List<String> sapMerchantCodes, @Param("sapCodes") List<String> sapCusCodes);

    List<CustomerRelationPo> selectSapSubCusList(@Param("sapMerchantCodes") List<String> sapMerchantCodes, @Param("sapCodes") List<String> sapCusCodes);

    CustomerRelationPo selectByMerchantCodeAndSubCode(@Param("merchantCode") String merchantCode, @Param("sapSubCusCode") String sapSubCusCode);

    List<CustomerRelationPo> selectAgreeDcAndMerchantCodes(@Param("agreementDcCodes") List<String> agreementDcCodes);

    List<CustomerRelationPo> selectByCusAndAgreeDcs(@Param("list") List<CustomerRelationPo> list);

    List<CustomerRelationPo> selectByMerchantCodeAndSubCodes(@Param("list") List<CustomerRelationPo> list);

    List<CustomerRelationPo> selectSapCusCodesBySearch(@Param("searchKey")String searchKey, @Param("merchantCodes")List<String> merchantCodes, @Param("dcCodes")List<String> dcCodes, @Param("size")Integer size);

    List<CustomerRelationPo> selectMerchantCodes(@Param("merchantCodes")List<String> merchantCodes, @Param("searchKey")String searchKey, @Param("size")Integer size);

    List<CustomerRelationPo> selectSapSubCusCodes(@Param("sapCusCode")String sapCusCode);

    List<CustomerRelationPo> selectMerchantCodesBySubCusCode(@Param("sapSubCusCode")String sapSubCusCode, @Param("merchantCodes")List<String> merchantCodes);

    List<CustomerRelationPo> selectGroupByCusAndMerchant(@Param("qo") CustomerRelationPageQo qo, @Param("limit") int limit, @Param("offset") int offset);

    List<CustomerRelationPo> selectPage(@Param("qo") CustomerRelationPageQo qo, @Param("limit") int limit, @Param("offset") int offset);

    int selectGroupByCusAndMerchantCount(@Param("qo") CustomerRelationPageQo qo);

    int selectPageCount(@Param("qo") CustomerRelationPageQo qo);

    int updateCustomerRelation(CustomerRelationPo relationPo);

    int insertList(List<CustomerRelationPo> list);

    int updateList(@Param("list") List<CustomerRelationPo> list);
}
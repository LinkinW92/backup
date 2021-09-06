package com.skeqi.htd.po.mapper;

import com.skeqi.htd.controller.vo.QueryVO;
import com.skeqi.htd.po.entity.PurchaseOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 采购订单持久层
 *
 * @author linkin
 */
@Mapper
public interface PurchaseOrderMapper {
	/**
	 * 采购订单查询
	 *
	 * @param vo
	 * @return
	 */
	List<PurchaseOrder> listOrdersBy(@Param("vo") QueryVO.QueryPurchaserOrderListVO vo);
}

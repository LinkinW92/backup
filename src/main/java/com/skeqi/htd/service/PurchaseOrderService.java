package com.skeqi.htd.service;

import com.skeqi.htd.controller.vo.QueryVO;
import com.skeqi.htd.po.entity.PurchaseOrder;

import java.util.List;

/**
 * 采购单服务
 *
 * @author linkin
 */
public interface PurchaseOrderService {
	/**
	 * 根据条件查询采购订单
	 *
	 * @param vo
	 * @return
	 */
	List<PurchaseOrder> queryBy(QueryVO.QueryPurchaserOrderListVO vo);
}

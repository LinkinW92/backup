package com.skeqi.htd.service;

import com.skeqi.htd.common.Asserts;
import com.skeqi.htd.common.BizException;
import com.skeqi.htd.common.OrderState;
import com.skeqi.htd.common.OrderType;
import com.skeqi.htd.controller.vo.PurchaseOrderVO;
import com.skeqi.htd.controller.vo.QueryVO;
import com.skeqi.htd.controller.vo.SaleOrderVO;
import com.skeqi.htd.po.entity.PurchaseOrder;
import com.skeqi.htd.po.entity.SaleOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务门户类
 *
 * @author linkin
 */
@Service
@Slf4j
public class HtdServiceFacade {
	private final CustomerService customerService;
	private final PurchaseOrderService purchaseOrderService;
	private final SaleOrderService saleOrderService;
	private final SubWarehouseService subWarehouseService;

	@Autowired
	public HtdServiceFacade(CustomerService customerService,
							PurchaseOrderService purchaseOrderService,
							SaleOrderService saleOrderService,
							SubWarehouseService subWarehouseService) {
		this.customerService = customerService;
		this.purchaseOrderService = purchaseOrderService;
		this.saleOrderService = saleOrderService;
		this.subWarehouseService = subWarehouseService;
	}


	/**
	 * 采购订单查询
	 *
	 * @return
	 */
	public PurchaseOrderVO.ItemVO queryPurchaserOrderList(QueryVO.QueryPurchaserOrderListVO vo) {
		List<PurchaseOrder> orders = this.purchaseOrderService.queryBy(vo);
		return null;
	}

	/**
	 * 采购订单查询
	 *
	 * @return
	 */
	public List<SaleOrder> listSaleOrder() {
		return new ArrayList<>();
	}

	/**
	 * 订单详情查询
	 *
	 * @param orderNo
	 * @param type
	 * @return
	 */
	public Object doGetOrderDetail(String orderNo, OrderType type) {
		Asserts.notEmpty(orderNo, "订单详情查询，订单号不可为空");
		Asserts.notNull(type, "未知的订单类型");
		switch (type) {
			case PURCHASE:
				return doGetPurchaseOrderDetail(orderNo);
			case SALE:
				return doGetSaleOrderDetail(orderNo);
			default:
				throw new BizException("未知的订单类型");
		}
	}

	/**
	 * 新增采购单
	 *
	 * @return
	 */
	public Object createPurchaseOrder(PurchaseOrderVO.CreateVO vo) {
		//1. 校验产品信息
		//2. 根据产品编码 和 规格 生成多比采购订单，但这些订单公用一个主订单号
		//3. 入库
		return null;
	}

	/**
	 * 新增销售单
	 *
	 * @return
	 */
	public Object createSaleOrder(SaleOrderVO.CreateVO vo) {

		return null;
	}

	/**
	 * 修改订单状态
	 */
	public void modifyOrderState(String orderNo, OrderState state) {
		//TODO 校验逻辑
	}

	/**
	 * 采购订单查询
	 *
	 * @return
	 */
	private Object doGetPurchaseOrderDetail(String orderNo) {
		return new ArrayList<>();
	}

	/**
	 * 采购订单查询
	 *
	 * @return
	 */
	private Object doGetSaleOrderDetail(String orderNo) {
		return new ArrayList<>();
	}


}

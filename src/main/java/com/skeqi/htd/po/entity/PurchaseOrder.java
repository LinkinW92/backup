package com.skeqi.htd.po.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 采购订单
 *
 * @author linkin
 */
@Data
public class PurchaseOrder extends Entity {
	/**
	 * 内部主订单号
	 */
	private String orderNo;
	/**
	 * 内部子订单号
	 */
	private String subOrderNo;
	/**
	 * 外部订单号
	 */
	private String exOrderNo;
	/**
	 * 单据日期
	 */
	private LocalDateTime orderTime;
	/**
	 * 交货日期
	 */
	private LocalDateTime deliveryTime;
	/**
	 * 退单时间
	 */
	private LocalDateTime cancelTime;

	/**
	 * 采购人员
	 */
	private String purchaser;
	/**
	 * 产品ID和产品名称
	 */
	private Integer productId;
	private String product;
	/**
	 * 产品动态信息，产品ID关联产品的静态信息，动态信息主要有：采购单价，优惠率，优惠金额，分仓信息
	 */
	private String productExt;
	/**
	 * 供应商id, 对应Supplier表的主键id
	 */
	private Integer supplierId;
	private String supplier;
	/**
	 * 应收款
	 */
	private String dueAccount;

	/**
	 * 附件,多个附件逗号分割
	 */
	private String materials;

	private String orderState;
	private String auditState;
	private String stockState;
	private String creator;

	/**
	 * 是否含税，根据订单得税率计算得出
	 */
	private Boolean hasTax;
}

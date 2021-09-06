package com.skeqi.htd.po.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 销售订单
 *
 * @author linkin
 */
@Data
public class SaleOrder extends Entity {
	private String orderNo;
	private String subOrderNo;
	private String orderState;
	private String auditState;
	/**
	 * 下单日期
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
	 * 客户信息，对应customer表的主键id
	 */
	private Integer customerId;
	/**
	 * 单位
	 */
	private String unit;
	/**
	 * 数量
	 */
	private Integer amount;
	/**
	 * 销售单价
	 */
	private String salePrice;
	/**
	 * 含税价
	 */
	private String priceWithTax;
	/**
	 * 税价合计
	 */
	private String total;
	/**
	 * 应收款
	 */
	private String dueAccounts;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 附件
	 */
	private List<String> materials;
	/**
	 * 申请人
	 */
	private String seller;
	private String creator;
}

package com.skeqi.htd.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 采购单VO
 *
 * @author linkin
 */
@Data
public class PurchaseOrderVO {

	@Data
	public static class CreateVO extends PurchaseOrderVO {
		private String orderNo;
		private String proposer;
		private LocalDateTime proposeTime;
		private String proposeDept;
		private String purchaser;
		private List<ProductVO> products;
	}

	@Data
	public static class DetailVO extends PurchaseOrderVO {
		@ApiModelProperty("订单阿红")
		private String orderNo;
		@ApiModelProperty("单据日期")
		private String orderTime;
		@ApiModelProperty("交货日期")
		private String deliveryTime;
		@ApiModelProperty("供应商名称")
		private String supplier;
		@ApiModelProperty("采购员名称")
		private String purchaser;
		@ApiModelProperty("产品信息")
		private List<ProductVO> products;
		@ApiModelProperty("附件信息")
		private List<String> materials;
		@ApiModelProperty("应付款")
		private String dueAccount;
		@ApiModelProperty("联系人")
		private String contact;
		@ApiModelProperty("联系人手机")
		private String contactMobile;
		@ApiModelProperty("联系人电话")
		private String contactTel;
		@ApiModelProperty("联系人地址")
		private String contactAddress;
		@ApiModelProperty("订单已付款")
		private String paidMoney;
		@ApiModelProperty("创建人")
		private String creator;
		@ApiModelProperty("创建时间")
		private String createTime;
		@ApiModelProperty("单据备注")
		private String remark;
	}

	@Data
	public static class ItemVO extends PurchaseOrderVO {
		@ApiModelProperty("订单号")
		private String orderNo;
		@ApiModelProperty("单据日期")
		private String orderTime;
		@ApiModelProperty("交货日期")
		private String deliveryTime;
		@ApiModelProperty("供应商名称")
		private String supplier;
		@ApiModelProperty("采购员名称")
		private String purchaser;
		@ApiModelProperty("优惠金额")
		private String favourableMoney;
		@ApiModelProperty("应付款")
		private String dueAccount;
		@ApiModelProperty("订单状态")
		private String orderState;
		@ApiModelProperty("关联入库单")
		private String relativeStockOrder;
		@ApiModelProperty("审核状态")
		private String auditState;
		@ApiModelProperty("当前审核人")
		private String auditor;
		@ApiModelProperty("最近一次审核时间")
		private String latestAuditTime;
		@ApiModelProperty("入库状态")
		private String stockState;
		@ApiModelProperty("单据备注")
		private String remark;
	}
}

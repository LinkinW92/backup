package com.skeqi.htd.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 销售订单vo
 *
 * @author linkin
 */
@Data
public class SaleOrderVO {
	@Data
	public static class CreateVO {
		private String orderNO;
		private LocalDateTime orderTime;
	}

	@Data
	public static class DetailVO extends SaleOrderVO {
		@ApiModelProperty("订单号")
		private String orderNo;
		@ApiModelProperty("单据日期")
		private String orderTime;
		@ApiModelProperty("交货日期")
		private String deliveryTime;
		@ApiModelProperty("客户名称")
		private String customer;
		@ApiModelProperty("销售名称")
		private String seller;
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
		@ApiModelProperty("订单已收款")
		private String collectedMoney;
		@ApiModelProperty("创建人")
		private String creator;
		@ApiModelProperty("创建时间")
		private String createTime;
		@ApiModelProperty("单据备注")
		private String remark;
	}

	@Data
	public static class ItemVO extends SaleOrderVO {
		@ApiModelProperty("订单号")
		private String orderNo;
		@ApiModelProperty("单据日期")
		private String orderTime;
		@ApiModelProperty("交货日期")
		private String deliveryTime;
		@ApiModelProperty("客户名称")
		private String customer;
		@ApiModelProperty("销售人员")
		private String seller;
		@ApiModelProperty("优惠金额")
		private String favourableMoney;
		@ApiModelProperty("应付款")
		private String dueAccount;
		@ApiModelProperty("订单状态")
		private String orderState;
		@ApiModelProperty("关联出库单")
		private String relativeStockOrder;
		@ApiModelProperty("审核状态")
		private String auditState;
		@ApiModelProperty("当前审核人")
		private String auditor;
		@ApiModelProperty("最近一次审核时间")
		private String latestAuditTime;
		@ApiModelProperty("出库状态")
		private String stockState;
		@ApiModelProperty("单据备注")
		private String remark;
	}
}

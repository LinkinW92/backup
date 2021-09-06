package com.skeqi.htd.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 产品vo
 *
 * @author linkin
 */
@Data
public class ProductVO {
	@ApiModelProperty("产品编码")
	private String code;
	@ApiModelProperty("产品名称")
	private String name;
	@ApiModelProperty("产品规格")
	private String sku;
	@ApiModelProperty("产品数量")
	private Integer amount;
	@ApiModelProperty("数量单位")
	private String unit;
	@ApiModelProperty("产品品牌")
	private String brand;
	@ApiModelProperty("产品分仓")
	private String subWarehouse;
	@ApiModelProperty("产品单价")
	private String unitPrice;
	@ApiModelProperty("产品销售价格")
	private String salePrice;
	@ApiModelProperty("含税单价")
	private String unitPriceWithTax;
	@ApiModelProperty("含税售价")
	private String salePriceWithTax;
	@ApiModelProperty("税率")
	private String taxRate;
	@ApiModelProperty("关联的采购/销售订单号")
	private String relativeOrderNo;
	@ApiModelProperty("备注")
	private String remark;
}

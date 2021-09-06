package com.skeqi.htd.controller;

import com.skeqi.htd.common.Result;
import com.skeqi.htd.controller.vo.PurchaseOrderVO;
import com.skeqi.htd.controller.vo.QueryVO;
import com.skeqi.htd.service.HtdServiceFacade;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.skeqi.htd.common.Constants.API_VERSION;
import static com.skeqi.htd.common.Constants.BASE_API;

/**
 * 高驱进销存
 *
 * @author linkin
 */
@Api("高驱进销存")
@RestController
@RequestMapping(value = BASE_API + API_VERSION)
public class HtdController {

	private final HtdServiceFacade facade;

	@Autowired
	public HtdController(HtdServiceFacade facade) {
		this.facade = facade;
	}

	@ApiOperation("获取采购订单列表")
	public Result<PurchaseOrderVO.ItemVO> queryPurchaserOrderList(QueryVO.QueryPurchaserOrderListVO vo) {
		return Result.succeed(facade.queryPurchaserOrderList(vo));
	}

	@ApiOperation("获取采购订单详情")
	public void m2() {
	}

	@ApiOperation("新增采购订单")
	public void m3() {
	}

	@ApiOperation("获取销售订单列表")
	public void m4() {
	}

	@ApiOperation("获取销售订单详情")
	public void m5() {
	}

	@ApiOperation("创建销售订单")
	public void m6() {
	}

	@ApiOperation("订单审批")
	public void m7() {
	}

	@ApiOperation("新增客户信息")
	public void m8() {
	}

	@ApiOperation("新增产品信息")
	public void m9() {
	}

	@ApiOperation("新增分仓信息")
	public void m10() {
	}

	@ApiOperation("新增供应商信息")
	public void m11() {
	}
}

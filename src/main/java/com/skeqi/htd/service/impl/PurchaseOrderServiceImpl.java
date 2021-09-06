package com.skeqi.htd.service.impl;

import com.skeqi.htd.common.Asserts;
import com.skeqi.htd.controller.vo.QueryVO;
import com.skeqi.htd.po.entity.PurchaseOrder;
import com.skeqi.htd.po.mapper.PurchaseOrderMapper;
import com.skeqi.htd.service.PurchaseOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
	private final PurchaseOrderMapper mapper;

	@Autowired
	public PurchaseOrderServiceImpl(PurchaseOrderMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<PurchaseOrder> queryBy(QueryVO.QueryPurchaserOrderListVO vo) {
		Asserts.notNull(vo, "无效的订单查询条件");
		return mapper.listOrdersBy(vo);
	}
}

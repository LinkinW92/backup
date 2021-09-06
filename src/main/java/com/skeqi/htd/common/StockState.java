package com.skeqi.htd.common;

import lombok.Getter;

/**
 * 入库状态
 *
 * @author linkin
 */
@Getter
public enum StockState {
	NONE("未入库"),

	PART("部分入库"),

	ALL("完全入库");

	private String description;

	StockState(String description) {
		this.description = description;
	}
}

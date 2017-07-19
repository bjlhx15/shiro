package com.lhx.ssm.mapper;

import java.util.List;

import com.lhx.ssm.po.ItemsCustom;
import com.lhx.ssm.po.ItemsQueryVo;

public interface ItemsMapperCustom {
	// 商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception;

}

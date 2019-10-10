package com.bobo.goods.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bobo.goods.dao.GoodsMapper;
import com.bobo.goods.domain.Goods;
import com.bobo.goods.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public PageInfo<Goods> selects(String gname, Integer page, Integer pageSize) {
      PageHelper.startPage(page, pageSize);
      List<Goods> list = goodsMapper.selects(gname);
		
		return new PageInfo<Goods>(list);
	}

	@Override
	public int add(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.add(goods);
	}

}

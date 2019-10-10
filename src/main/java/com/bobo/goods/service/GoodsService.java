package com.bobo.goods.service;

import java.util.List;

import com.bobo.goods.domain.Goods;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	/**
	  * 列表
	  * @Title: selects 
	  * @Description: TODO
	  * @return
	  * @return: List<Goods>
	  */
		PageInfo<Goods> selects(String gname ,Integer page,Integer pageSize);
		/**
		 * 增加
		 * @Title: add 
		 * @Description: TODO
		 * @param goods
		 * @return
		 * @return: int
		 */
		int add(Goods goods);
		
}

package com.bobo.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bobo.goods.domain.Goods;

public interface GoodsMapper {
 /**
  * 列表
  * @Title: selects 
  * @Description: TODO
  * @return
  * @return: List<Goods>
  */
	List<Goods> selects(@Param("gname")String gname);
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

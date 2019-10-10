package com.bobo.goods.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bobo.goods.domain.Goods;
import com.bobo.goods.service.GoodsService;
import com.bobo.goods.util.PageUtil;
import com.github.pagehelper.PageInfo;
//aaaaaaaaaaaaaaaaa 1704E 
@Controller
public class GoodsController {
	
	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("selects")
	public String selects(HttpServletRequest request,@RequestParam(defaultValue = "")String gname,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "3")Integer pageSize) {
		PageInfo<Goods> info = goodsService.selects(gname, page, pageSize);
		
		PageUtil.page(request, "/selects?gname="+gname, pageSize, info.getList(), (int)info.getTotal(), page);
		request.setAttribute("goods", info.getList());
		request.setAttribute("gname", gname);
		
		return "goods";
		
	}
	/**
	 * 去增加
	 * @Title: add 
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	@GetMapping("add")
	public String add() {
		
		return "add";
	}
	
	/**
	 * 去增加
	 * @Title: add 
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	@ResponseBody
	@PostMapping("add")
	public boolean add(Goods goods,MultipartFile file) {
		if(!file.isEmpty()) {
			//文件上传路径
			String path ="d:/pic/";
			//改变上传文件名称
			  //1/h获取原始的文件名称  1.jpg
			  String oldName = file.getOriginalFilename();
			  //使用uuid随机生成文件名称
			String newFileName = UUID.randomUUID() + oldName.substring(oldName.lastIndexOf("."));
		
		    File file2 = new File(path + newFileName);
		  
		    try {
		    	  //把文件写入硬盘
				file.transferTo(file2);
				//设置商品的图片地址
				goods.setUrl(newFileName);
				
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return goodsService.add(goods)>0;
		
		
		
	}

}

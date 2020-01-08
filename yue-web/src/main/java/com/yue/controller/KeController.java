package com.yue.controller;

import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yue.pojo.TbDing;
import com.yue.pojo.TbKe;
import com.yue.pojo.TbUser;
import com.yue.service.KeService;
import com.yue.service.UserService;

import entity.PageResult;
import entity.Result;
import utils.AliyunOSSClientUtils;

@RequestMapping("/ke")
@RestController
public class KeController {

	@Reference
	private KeService service;
	@Reference
	private UserService userService;
	
	//查询课程列表
	@RequestMapping("/list")
	public PageResult list(Integer page,Integer size){
		return service.findByList(page,size);
	}
	//获取当前登录人
	@RequestMapping("/username")
	public TbUser username(){
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		TbUser login = userService.login(name);
		return login;
	}
	//上传图片
	@RequestMapping("/upload")
	public Result upload(MultipartFile file){
		//连接阿里云工具类
		AliyunOSSClientUtils aliyunOSSClientUtils = new AliyunOSSClientUtils();
		try {
			String uploadImg2Oss = aliyunOSSClientUtils.uploadImg2Oss(file);
			String imgUrl = aliyunOSSClientUtils.getImgUrl(uploadImg2Oss);
			return new Result(true, imgUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Result(false, "上传图片失败");
	}
	//添加课程
	@RequestMapping("/add")
	public Result add(@RequestBody TbKe ke){
		if(service.add(ke)!=0){
			//成功
			return new Result(true, "成功");
		}
		//失败
		return new Result(false, "失败");
	}
	//修改状态（上架下架）
	@RequestMapping("/updateStatus")
	public Result updateStatus(Integer id){
		if(service.updateStatus(id)!=0){
			//成功
			return new Result(true, "成功");
		}
		//失败
		return new Result(false, "失败");
	}
	//回显课程列表
	@RequestMapping("/findOne")
	public TbKe findOne(Integer id){
		return service.findOne(id);
	}
	//下单提交
	@RequestMapping("/tj")
	public Result tj(@RequestBody TbKe tbKe){
		//获取当前登录人
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		if(service.tj(tbKe,name)!=0){
			return new Result(true, "下单成功");
		}
		return new Result(false, "下单失败");
	}
	//查询订单列表
	@RequestMapping("/findByDingList")
	public List<TbDing> findByDingList(){
		return service.findByDingList();
	}
}

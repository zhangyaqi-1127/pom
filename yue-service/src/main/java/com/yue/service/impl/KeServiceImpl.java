package com.yue.service.impl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yue.mapper.TbDingMapper;
import com.yue.mapper.TbKeMapper;
import com.yue.pojo.TbDing;
import com.yue.pojo.TbKe;
import com.yue.service.KeService;

import entity.PageResult;
import freemarker.template.Configuration;
import freemarker.template.Template;

@Service
public class KeServiceImpl implements KeService {

	@Resource
	private TbKeMapper tbKeMapper;
	@Resource
	private FreeMarkerConfig freeMarkerConfig;
	@Resource
	private TbDingMapper tbDingMapper;
	
	@Override
	public PageResult findByList(Integer page, Integer size) {
		// TODO Auto-generated method stub
		//开始分页
		PageHelper.startPage(page, size);
		PageInfo<TbKe> pageInfo = new PageInfo<>(tbKeMapper.selectByExample(null));
		return new PageResult(pageInfo.getTotal(), pageInfo.getList());
	}

	@Override
	public int add(TbKe ke) {
		// TODO Auto-generated method stub
		if(ke!=null){
			//雪花算法
			UUID randomUUID = UUID.randomUUID();
			String string = randomUUID.toString();
			//状态默认为未发布
			ke.setStatus(0);
			ke.setKeId(string);
			return tbKeMapper.insert(ke);
		}
		return 0;
	}

	@Override
	public int updateStatus(Integer id) {
		// TODO Auto-generated method stub
		TbKe selectByPrimaryKey = tbKeMapper.selectByPrimaryKey(id);
		if(selectByPrimaryKey!=null){
			if(selectByPrimaryKey.getStatus()==0){
				Configuration configuration = freeMarkerConfig.getConfiguration();
				try {
					//获取模板
					Template template = configuration.getTemplate("item.ftl");
					//创建map集合
					Map hashMap = new HashMap<>();
					//将查出的整条数据放入map中
					hashMap.put("ke", selectByPrimaryKey);
					Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D://temp//"+selectByPrimaryKey.getId()+".html"),"UTF-8"));
					template.process(hashMap, writer);
					//关闭流
					writer.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return tbKeMapper.updateStatus(selectByPrimaryKey);
			}else{
				return tbKeMapper.updateStatus2(selectByPrimaryKey);
			}
		}
		return 0;
	}

	@Override
	public TbKe findOne(Integer id) {
		// TODO Auto-generated method stub
		//根据id查询整条数据
		return tbKeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int tj(TbKe tbKe,String name) {
		// TODO Auto-generated method stub
		//雪花算法
		UUID randomUUID = UUID.randomUUID();
		String string = randomUUID.toString();
		TbDing tbDing = new TbDing();
		//设置值
		tbDing.setDingId(string);
		tbDing.setKeId(tbKe.getKeId());
		tbDing.setPrice(tbKe.getPrice());
		tbDing.setBuyName(name);
		//状态默认为未支付
		tbDing.setStatus("0");
		if(tbDingMapper.insert(tbDing)!=0){
			return 1;
		}
		return 0;
	}

	@Override
	public List<TbDing> findByDingList() {
		// TODO Auto-generated method stub
		//查询我的商品列表
		return tbDingMapper.selectByExample(null);
	}

}

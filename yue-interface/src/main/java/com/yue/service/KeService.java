package com.yue.service;

import java.util.List;

import com.yue.pojo.TbDing;
import com.yue.pojo.TbKe;

import entity.PageResult;

public interface KeService {

	PageResult findByList(Integer page, Integer size);

	int add(TbKe ke);

	int updateStatus(Integer id);

	TbKe findOne(Integer id);

	int tj(TbKe tbKe, String name);

	List<TbDing> findByDingList();

}

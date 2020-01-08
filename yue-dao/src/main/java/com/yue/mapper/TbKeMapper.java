package com.yue.mapper;

import com.yue.pojo.TbKe;
import com.yue.pojo.TbKeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface TbKeMapper {
    int countByExample(TbKeExample example);

    int deleteByExample(TbKeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbKe record);

    int insertSelective(TbKe record);

    List<TbKe> selectByExample(TbKeExample example);

    TbKe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbKe record, @Param("example") TbKeExample example);

    int updateByExample(@Param("record") TbKe record, @Param("example") TbKeExample example);

    int updateByPrimaryKeySelective(TbKe record);

    int updateByPrimaryKey(TbKe record);

    @Update(value="update tb_ke set status=1 where id=#{id}")
	int updateStatus(TbKe selectByPrimaryKey);

    @Update(value="update tb_ke set status=0 where id=#{id}")
	int updateStatus2(TbKe selectByPrimaryKey);
}
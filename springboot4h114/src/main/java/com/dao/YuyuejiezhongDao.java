package com.dao;

import com.entity.YuyuejiezhongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuejiezhongVO;
import com.entity.view.YuyuejiezhongView;


/**
 * 预约接种
 * 
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface YuyuejiezhongDao extends BaseMapper<YuyuejiezhongEntity> {
	
	List<YuyuejiezhongVO> selectListVO(@Param("ew") Wrapper<YuyuejiezhongEntity> wrapper);
	
	YuyuejiezhongVO selectVO(@Param("ew") Wrapper<YuyuejiezhongEntity> wrapper);
	
	List<YuyuejiezhongView> selectListView(@Param("ew") Wrapper<YuyuejiezhongEntity> wrapper);

	List<YuyuejiezhongView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuejiezhongEntity> wrapper);
	
	YuyuejiezhongView selectView(@Param("ew") Wrapper<YuyuejiezhongEntity> wrapper);
	
}

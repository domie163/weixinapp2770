package com.dao;

import com.entity.YimiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaoxinxiVO;
import com.entity.view.YimiaoxinxiView;


/**
 * 疫苗信息
 * 
 * @author 
 * @email 
 * @date 2021-05-02 02:14:09
 */
public interface YimiaoxinxiDao extends BaseMapper<YimiaoxinxiEntity> {
	
	List<YimiaoxinxiVO> selectListVO(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
	
	YimiaoxinxiVO selectVO(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
	
	List<YimiaoxinxiView> selectListView(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);

	List<YimiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
	
	YimiaoxinxiView selectView(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
	
}

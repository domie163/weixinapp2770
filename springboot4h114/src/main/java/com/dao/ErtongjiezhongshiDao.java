package com.dao;

import com.entity.ErtongjiezhongshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErtongjiezhongshiVO;
import com.entity.view.ErtongjiezhongshiView;


/**
 * 儿童接种史
 * 
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface ErtongjiezhongshiDao extends BaseMapper<ErtongjiezhongshiEntity> {
	
	List<ErtongjiezhongshiVO> selectListVO(@Param("ew") Wrapper<ErtongjiezhongshiEntity> wrapper);
	
	ErtongjiezhongshiVO selectVO(@Param("ew") Wrapper<ErtongjiezhongshiEntity> wrapper);
	
	List<ErtongjiezhongshiView> selectListView(@Param("ew") Wrapper<ErtongjiezhongshiEntity> wrapper);

	List<ErtongjiezhongshiView> selectListView(Pagination page,@Param("ew") Wrapper<ErtongjiezhongshiEntity> wrapper);
	
	ErtongjiezhongshiView selectView(@Param("ew") Wrapper<ErtongjiezhongshiEntity> wrapper);
	
}

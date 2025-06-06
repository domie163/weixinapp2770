package com.dao;

import com.entity.ErtongjiezhongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErtongjiezhongVO;
import com.entity.view.ErtongjiezhongView;


/**
 * 儿童接种
 * 
 * @author 
 * @email 
 * @date 2021-05-02 02:14:09
 */
public interface ErtongjiezhongDao extends BaseMapper<ErtongjiezhongEntity> {
	
	List<ErtongjiezhongVO> selectListVO(@Param("ew") Wrapper<ErtongjiezhongEntity> wrapper);
	
	ErtongjiezhongVO selectVO(@Param("ew") Wrapper<ErtongjiezhongEntity> wrapper);
	
	List<ErtongjiezhongView> selectListView(@Param("ew") Wrapper<ErtongjiezhongEntity> wrapper);

	List<ErtongjiezhongView> selectListView(Pagination page,@Param("ew") Wrapper<ErtongjiezhongEntity> wrapper);
	
	ErtongjiezhongView selectView(@Param("ew") Wrapper<ErtongjiezhongEntity> wrapper);
	
}

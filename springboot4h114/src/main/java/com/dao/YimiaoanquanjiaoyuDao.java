package com.dao;

import com.entity.YimiaoanquanjiaoyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaoanquanjiaoyuVO;
import com.entity.view.YimiaoanquanjiaoyuView;


/**
 * 疫苗安全教育
 * 
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface YimiaoanquanjiaoyuDao extends BaseMapper<YimiaoanquanjiaoyuEntity> {
	
	List<YimiaoanquanjiaoyuVO> selectListVO(@Param("ew") Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
	
	YimiaoanquanjiaoyuVO selectVO(@Param("ew") Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
	
	List<YimiaoanquanjiaoyuView> selectListView(@Param("ew") Wrapper<YimiaoanquanjiaoyuEntity> wrapper);

	List<YimiaoanquanjiaoyuView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
	
	YimiaoanquanjiaoyuView selectView(@Param("ew") Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
	
}

package com.dao;

import com.entity.YiliaojigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaojigouVO;
import com.entity.view.YiliaojigouView;


/**
 * 医疗机构
 * 
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface YiliaojigouDao extends BaseMapper<YiliaojigouEntity> {
	
	List<YiliaojigouVO> selectListVO(@Param("ew") Wrapper<YiliaojigouEntity> wrapper);
	
	YiliaojigouVO selectVO(@Param("ew") Wrapper<YiliaojigouEntity> wrapper);
	
	List<YiliaojigouView> selectListView(@Param("ew") Wrapper<YiliaojigouEntity> wrapper);

	List<YiliaojigouView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaojigouEntity> wrapper);
	
	YiliaojigouView selectView(@Param("ew") Wrapper<YiliaojigouEntity> wrapper);
	
}

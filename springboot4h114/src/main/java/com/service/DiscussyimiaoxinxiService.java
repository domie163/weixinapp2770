package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyimiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyimiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyimiaoxinxiView;


/**
 * 疫苗信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface DiscussyimiaoxinxiService extends IService<DiscussyimiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyimiaoxinxiVO> selectListVO(Wrapper<DiscussyimiaoxinxiEntity> wrapper);
   	
   	DiscussyimiaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussyimiaoxinxiEntity> wrapper);
   	
   	List<DiscussyimiaoxinxiView> selectListView(Wrapper<DiscussyimiaoxinxiEntity> wrapper);
   	
   	DiscussyimiaoxinxiView selectView(@Param("ew") Wrapper<DiscussyimiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyimiaoxinxiEntity> wrapper);
   	
}


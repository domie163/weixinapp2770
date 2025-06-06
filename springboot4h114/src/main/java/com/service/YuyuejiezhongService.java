package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuejiezhongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuejiezhongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuejiezhongView;


/**
 * 预约接种
 *
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface YuyuejiezhongService extends IService<YuyuejiezhongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuejiezhongVO> selectListVO(Wrapper<YuyuejiezhongEntity> wrapper);
   	
   	YuyuejiezhongVO selectVO(@Param("ew") Wrapper<YuyuejiezhongEntity> wrapper);
   	
   	List<YuyuejiezhongView> selectListView(Wrapper<YuyuejiezhongEntity> wrapper);
   	
   	YuyuejiezhongView selectView(@Param("ew") Wrapper<YuyuejiezhongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuejiezhongEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErtongjiezhongshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErtongjiezhongshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErtongjiezhongshiView;


/**
 * 儿童接种史
 *
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface ErtongjiezhongshiService extends IService<ErtongjiezhongshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErtongjiezhongshiVO> selectListVO(Wrapper<ErtongjiezhongshiEntity> wrapper);
   	
   	ErtongjiezhongshiVO selectVO(@Param("ew") Wrapper<ErtongjiezhongshiEntity> wrapper);
   	
   	List<ErtongjiezhongshiView> selectListView(Wrapper<ErtongjiezhongshiEntity> wrapper);
   	
   	ErtongjiezhongshiView selectView(@Param("ew") Wrapper<ErtongjiezhongshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErtongjiezhongshiEntity> wrapper);
   	
}


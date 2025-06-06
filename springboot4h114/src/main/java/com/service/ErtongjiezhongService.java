package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErtongjiezhongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErtongjiezhongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErtongjiezhongView;


/**
 * 儿童接种
 *
 * @author 
 * @email 
 * @date 2021-05-02 02:14:09
 */
public interface ErtongjiezhongService extends IService<ErtongjiezhongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErtongjiezhongVO> selectListVO(Wrapper<ErtongjiezhongEntity> wrapper);
   	
   	ErtongjiezhongVO selectVO(@Param("ew") Wrapper<ErtongjiezhongEntity> wrapper);
   	
   	List<ErtongjiezhongView> selectListView(Wrapper<ErtongjiezhongEntity> wrapper);
   	
   	ErtongjiezhongView selectView(@Param("ew") Wrapper<ErtongjiezhongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErtongjiezhongEntity> wrapper);
   	
}


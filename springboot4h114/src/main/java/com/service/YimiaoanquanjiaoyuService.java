package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaoanquanjiaoyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaoanquanjiaoyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaoanquanjiaoyuView;


/**
 * 疫苗安全教育
 *
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface YimiaoanquanjiaoyuService extends IService<YimiaoanquanjiaoyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaoanquanjiaoyuVO> selectListVO(Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
   	
   	YimiaoanquanjiaoyuVO selectVO(@Param("ew") Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
   	
   	List<YimiaoanquanjiaoyuView> selectListView(Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
   	
   	YimiaoanquanjiaoyuView selectView(@Param("ew") Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaoanquanjiaoyuEntity> wrapper);
   	
}


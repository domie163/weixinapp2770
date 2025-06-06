package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaojigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaojigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaojigouView;


/**
 * 医疗机构
 *
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public interface YiliaojigouService extends IService<YiliaojigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaojigouVO> selectListVO(Wrapper<YiliaojigouEntity> wrapper);
   	
   	YiliaojigouVO selectVO(@Param("ew") Wrapper<YiliaojigouEntity> wrapper);
   	
   	List<YiliaojigouView> selectListView(Wrapper<YiliaojigouEntity> wrapper);
   	
   	YiliaojigouView selectView(@Param("ew") Wrapper<YiliaojigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaojigouEntity> wrapper);
   	
}


package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YimiaoanquanjiaoyuDao;
import com.entity.YimiaoanquanjiaoyuEntity;
import com.service.YimiaoanquanjiaoyuService;
import com.entity.vo.YimiaoanquanjiaoyuVO;
import com.entity.view.YimiaoanquanjiaoyuView;

@Service("yimiaoanquanjiaoyuService")
public class YimiaoanquanjiaoyuServiceImpl extends ServiceImpl<YimiaoanquanjiaoyuDao, YimiaoanquanjiaoyuEntity> implements YimiaoanquanjiaoyuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaoanquanjiaoyuEntity> page = this.selectPage(
                new Query<YimiaoanquanjiaoyuEntity>(params).getPage(),
                new EntityWrapper<YimiaoanquanjiaoyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaoanquanjiaoyuEntity> wrapper) {
		  Page<YimiaoanquanjiaoyuView> page =new Query<YimiaoanquanjiaoyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaoanquanjiaoyuVO> selectListVO(Wrapper<YimiaoanquanjiaoyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaoanquanjiaoyuVO selectVO(Wrapper<YimiaoanquanjiaoyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaoanquanjiaoyuView> selectListView(Wrapper<YimiaoanquanjiaoyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaoanquanjiaoyuView selectView(Wrapper<YimiaoanquanjiaoyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

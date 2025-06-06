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


import com.dao.YiliaojigouDao;
import com.entity.YiliaojigouEntity;
import com.service.YiliaojigouService;
import com.entity.vo.YiliaojigouVO;
import com.entity.view.YiliaojigouView;

@Service("yiliaojigouService")
public class YiliaojigouServiceImpl extends ServiceImpl<YiliaojigouDao, YiliaojigouEntity> implements YiliaojigouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaojigouEntity> page = this.selectPage(
                new Query<YiliaojigouEntity>(params).getPage(),
                new EntityWrapper<YiliaojigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaojigouEntity> wrapper) {
		  Page<YiliaojigouView> page =new Query<YiliaojigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaojigouVO> selectListVO(Wrapper<YiliaojigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaojigouVO selectVO(Wrapper<YiliaojigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaojigouView> selectListView(Wrapper<YiliaojigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaojigouView selectView(Wrapper<YiliaojigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

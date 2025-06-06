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


import com.dao.YuyuejiezhongDao;
import com.entity.YuyuejiezhongEntity;
import com.service.YuyuejiezhongService;
import com.entity.vo.YuyuejiezhongVO;
import com.entity.view.YuyuejiezhongView;

@Service("yuyuejiezhongService")
public class YuyuejiezhongServiceImpl extends ServiceImpl<YuyuejiezhongDao, YuyuejiezhongEntity> implements YuyuejiezhongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuejiezhongEntity> page = this.selectPage(
                new Query<YuyuejiezhongEntity>(params).getPage(),
                new EntityWrapper<YuyuejiezhongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuejiezhongEntity> wrapper) {
		  Page<YuyuejiezhongView> page =new Query<YuyuejiezhongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuejiezhongVO> selectListVO(Wrapper<YuyuejiezhongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuejiezhongVO selectVO(Wrapper<YuyuejiezhongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuejiezhongView> selectListView(Wrapper<YuyuejiezhongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuejiezhongView selectView(Wrapper<YuyuejiezhongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

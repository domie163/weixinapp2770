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


import com.dao.DiscussyimiaoxinxiDao;
import com.entity.DiscussyimiaoxinxiEntity;
import com.service.DiscussyimiaoxinxiService;
import com.entity.vo.DiscussyimiaoxinxiVO;
import com.entity.view.DiscussyimiaoxinxiView;

@Service("discussyimiaoxinxiService")
public class DiscussyimiaoxinxiServiceImpl extends ServiceImpl<DiscussyimiaoxinxiDao, DiscussyimiaoxinxiEntity> implements DiscussyimiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyimiaoxinxiEntity> page = this.selectPage(
                new Query<DiscussyimiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyimiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyimiaoxinxiEntity> wrapper) {
		  Page<DiscussyimiaoxinxiView> page =new Query<DiscussyimiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyimiaoxinxiVO> selectListVO(Wrapper<DiscussyimiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyimiaoxinxiVO selectVO(Wrapper<DiscussyimiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyimiaoxinxiView> selectListView(Wrapper<DiscussyimiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyimiaoxinxiView selectView(Wrapper<DiscussyimiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

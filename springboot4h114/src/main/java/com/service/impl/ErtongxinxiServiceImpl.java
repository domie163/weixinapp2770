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


import com.dao.ErtongxinxiDao;
import com.entity.ErtongxinxiEntity;
import com.service.ErtongxinxiService;
import com.entity.vo.ErtongxinxiVO;
import com.entity.view.ErtongxinxiView;

@Service("ertongxinxiService")
public class ErtongxinxiServiceImpl extends ServiceImpl<ErtongxinxiDao, ErtongxinxiEntity> implements ErtongxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErtongxinxiEntity> page = this.selectPage(
                new Query<ErtongxinxiEntity>(params).getPage(),
                new EntityWrapper<ErtongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErtongxinxiEntity> wrapper) {
		  Page<ErtongxinxiView> page =new Query<ErtongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErtongxinxiVO> selectListVO(Wrapper<ErtongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErtongxinxiVO selectVO(Wrapper<ErtongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErtongxinxiView> selectListView(Wrapper<ErtongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErtongxinxiView selectView(Wrapper<ErtongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

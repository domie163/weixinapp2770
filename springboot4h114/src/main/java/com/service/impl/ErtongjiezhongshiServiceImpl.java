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


import com.dao.ErtongjiezhongshiDao;
import com.entity.ErtongjiezhongshiEntity;
import com.service.ErtongjiezhongshiService;
import com.entity.vo.ErtongjiezhongshiVO;
import com.entity.view.ErtongjiezhongshiView;

@Service("ertongjiezhongshiService")
public class ErtongjiezhongshiServiceImpl extends ServiceImpl<ErtongjiezhongshiDao, ErtongjiezhongshiEntity> implements ErtongjiezhongshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErtongjiezhongshiEntity> page = this.selectPage(
                new Query<ErtongjiezhongshiEntity>(params).getPage(),
                new EntityWrapper<ErtongjiezhongshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErtongjiezhongshiEntity> wrapper) {
		  Page<ErtongjiezhongshiView> page =new Query<ErtongjiezhongshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErtongjiezhongshiVO> selectListVO(Wrapper<ErtongjiezhongshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErtongjiezhongshiVO selectVO(Wrapper<ErtongjiezhongshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErtongjiezhongshiView> selectListView(Wrapper<ErtongjiezhongshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErtongjiezhongshiView selectView(Wrapper<ErtongjiezhongshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

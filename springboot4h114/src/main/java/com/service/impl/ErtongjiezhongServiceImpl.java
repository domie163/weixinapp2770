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


import com.dao.ErtongjiezhongDao;
import com.entity.ErtongjiezhongEntity;
import com.service.ErtongjiezhongService;
import com.entity.vo.ErtongjiezhongVO;
import com.entity.view.ErtongjiezhongView;

@Service("ertongjiezhongService")
public class ErtongjiezhongServiceImpl extends ServiceImpl<ErtongjiezhongDao, ErtongjiezhongEntity> implements ErtongjiezhongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErtongjiezhongEntity> page = this.selectPage(
                new Query<ErtongjiezhongEntity>(params).getPage(),
                new EntityWrapper<ErtongjiezhongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErtongjiezhongEntity> wrapper) {
		  Page<ErtongjiezhongView> page =new Query<ErtongjiezhongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErtongjiezhongVO> selectListVO(Wrapper<ErtongjiezhongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErtongjiezhongVO selectVO(Wrapper<ErtongjiezhongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErtongjiezhongView> selectListView(Wrapper<ErtongjiezhongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErtongjiezhongView selectView(Wrapper<ErtongjiezhongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

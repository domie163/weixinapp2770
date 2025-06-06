package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ErtongjiezhongshiEntity;
import com.entity.view.ErtongjiezhongshiView;

import com.service.ErtongjiezhongshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 儿童接种史
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
@RestController
@RequestMapping("/ertongjiezhongshi")
public class ErtongjiezhongshiController {
    @Autowired
    private ErtongjiezhongshiService ertongjiezhongshiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ErtongjiezhongshiEntity ertongjiezhongshi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			ertongjiezhongshi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ErtongjiezhongshiEntity> ew = new EntityWrapper<ErtongjiezhongshiEntity>();
		PageUtils page = ertongjiezhongshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ertongjiezhongshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ErtongjiezhongshiEntity ertongjiezhongshi, 
		HttpServletRequest request){
        EntityWrapper<ErtongjiezhongshiEntity> ew = new EntityWrapper<ErtongjiezhongshiEntity>();
		PageUtils page = ertongjiezhongshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ertongjiezhongshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ErtongjiezhongshiEntity ertongjiezhongshi){
       	EntityWrapper<ErtongjiezhongshiEntity> ew = new EntityWrapper<ErtongjiezhongshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ertongjiezhongshi, "ertongjiezhongshi")); 
        return R.ok().put("data", ertongjiezhongshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ErtongjiezhongshiEntity ertongjiezhongshi){
        EntityWrapper< ErtongjiezhongshiEntity> ew = new EntityWrapper< ErtongjiezhongshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ertongjiezhongshi, "ertongjiezhongshi")); 
		ErtongjiezhongshiView ertongjiezhongshiView =  ertongjiezhongshiService.selectView(ew);
		return R.ok("查询儿童接种史成功").put("data", ertongjiezhongshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ErtongjiezhongshiEntity ertongjiezhongshi = ertongjiezhongshiService.selectById(id);
        return R.ok().put("data", ertongjiezhongshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ErtongjiezhongshiEntity ertongjiezhongshi = ertongjiezhongshiService.selectById(id);
        return R.ok().put("data", ertongjiezhongshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ErtongjiezhongshiEntity ertongjiezhongshi, HttpServletRequest request){
    	ertongjiezhongshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ertongjiezhongshi);
        ertongjiezhongshiService.insert(ertongjiezhongshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ErtongjiezhongshiEntity ertongjiezhongshi, HttpServletRequest request){
    	ertongjiezhongshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ertongjiezhongshi);
        ertongjiezhongshiService.insert(ertongjiezhongshi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ErtongjiezhongshiEntity ertongjiezhongshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ertongjiezhongshi);
        ertongjiezhongshiService.updateById(ertongjiezhongshi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ertongjiezhongshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ErtongjiezhongshiEntity> wrapper = new EntityWrapper<ErtongjiezhongshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = ertongjiezhongshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

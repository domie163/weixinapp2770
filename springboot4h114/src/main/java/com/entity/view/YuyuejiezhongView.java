package com.entity.view;

import com.entity.YuyuejiezhongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约接种
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
@TableName("yuyuejiezhong")
public class YuyuejiezhongView  extends YuyuejiezhongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyuejiezhongView(){
	}
 
 	public YuyuejiezhongView(YuyuejiezhongEntity yuyuejiezhongEntity){
 	try {
			BeanUtils.copyProperties(this, yuyuejiezhongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

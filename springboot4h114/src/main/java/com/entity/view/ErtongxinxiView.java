package com.entity.view;

import com.entity.ErtongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 儿童信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:09
 */
@TableName("ertongxinxi")
public class ErtongxinxiView  extends ErtongxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErtongxinxiView(){
	}
 
 	public ErtongxinxiView(ErtongxinxiEntity ertongxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, ertongxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

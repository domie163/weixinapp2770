package com.entity.view;

import com.entity.ErtongjiezhongshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 儿童接种史
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
@TableName("ertongjiezhongshi")
public class ErtongjiezhongshiView  extends ErtongjiezhongshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErtongjiezhongshiView(){
	}
 
 	public ErtongjiezhongshiView(ErtongjiezhongshiEntity ertongjiezhongshiEntity){
 	try {
			BeanUtils.copyProperties(this, ertongjiezhongshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.DiscussyimiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
@TableName("discussyimiaoxinxi")
public class DiscussyimiaoxinxiView  extends DiscussyimiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyimiaoxinxiView(){
	}
 
 	public DiscussyimiaoxinxiView(DiscussyimiaoxinxiEntity discussyimiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyimiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

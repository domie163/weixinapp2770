package com.entity.view;

import com.entity.YimiaoanquanjiaoyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗安全教育
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
@TableName("yimiaoanquanjiaoyu")
public class YimiaoanquanjiaoyuView  extends YimiaoanquanjiaoyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaoanquanjiaoyuView(){
	}
 
 	public YimiaoanquanjiaoyuView(YimiaoanquanjiaoyuEntity yimiaoanquanjiaoyuEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaoanquanjiaoyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

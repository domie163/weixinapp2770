package com.entity.model;

import com.entity.YiliaojigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医疗机构
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public class YiliaojigouModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 法人代表
	 */
	
	private String farendaibiao;
		
	/**
	 * 占地面积
	 */
	
	private String zhandimianji;
		
	/**
	 * 可预约人数
	 */
	
	private String keyuyuerenshu;
		
	/**
	 * 工作人员
	 */
	
	private String gongzuorenyuan;
		
	/**
	 * 机构图片
	 */
	
	private String jigoutupian;
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：法人代表
	 */
	 
	public void setFarendaibiao(String farendaibiao) {
		this.farendaibiao = farendaibiao;
	}
	
	/**
	 * 获取：法人代表
	 */
	public String getFarendaibiao() {
		return farendaibiao;
	}
				
	
	/**
	 * 设置：占地面积
	 */
	 
	public void setZhandimianji(String zhandimianji) {
		this.zhandimianji = zhandimianji;
	}
	
	/**
	 * 获取：占地面积
	 */
	public String getZhandimianji() {
		return zhandimianji;
	}
				
	
	/**
	 * 设置：可预约人数
	 */
	 
	public void setKeyuyuerenshu(String keyuyuerenshu) {
		this.keyuyuerenshu = keyuyuerenshu;
	}
	
	/**
	 * 获取：可预约人数
	 */
	public String getKeyuyuerenshu() {
		return keyuyuerenshu;
	}
				
	
	/**
	 * 设置：工作人员
	 */
	 
	public void setGongzuorenyuan(String gongzuorenyuan) {
		this.gongzuorenyuan = gongzuorenyuan;
	}
	
	/**
	 * 获取：工作人员
	 */
	public String getGongzuorenyuan() {
		return gongzuorenyuan;
	}
				
	
	/**
	 * 设置：机构图片
	 */
	 
	public void setJigoutupian(String jigoutupian) {
		this.jigoutupian = jigoutupian;
	}
	
	/**
	 * 获取：机构图片
	 */
	public String getJigoutupian() {
		return jigoutupian;
	}
			
}

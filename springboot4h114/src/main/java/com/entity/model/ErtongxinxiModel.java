package com.entity.model;

import com.entity.ErtongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 儿童信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-02 02:14:09
 */
public class ErtongxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 监护人姓名
	 */
	
	private String jianhurenxingming;
		
	/**
	 * 儿童姓名
	 */
	
	private String ertongxingming;
		
	/**
	 * 接种编号
	 */
	
	private String jiezhongbianhao;
		
	/**
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengriqi;
		
	/**
	 * 儿童性别
	 */
	
	private String ertongxingbie;
		
	/**
	 * 孕期周数
	 */
	
	private String yunqizhoushu;
		
	/**
	 * 出生身高
	 */
	
	private String chushengshengao;
		
	/**
	 * 出生体重
	 */
	
	private String chushengtizhong;
		
	/**
	 * 儿童过敏史
	 */
	
	private String ertongguominshi;
		
	/**
	 * 监护人电话
	 */
	
	private String jianhurendianhua;
		
	/**
	 * 儿童关系
	 */
	
	private String ertongguanxi;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
	/**
	 * 设置：监护人姓名
	 */
	 
	public void setJianhurenxingming(String jianhurenxingming) {
		this.jianhurenxingming = jianhurenxingming;
	}
	
	/**
	 * 获取：监护人姓名
	 */
	public String getJianhurenxingming() {
		return jianhurenxingming;
	}
				
	
	/**
	 * 设置：儿童姓名
	 */
	 
	public void setErtongxingming(String ertongxingming) {
		this.ertongxingming = ertongxingming;
	}
	
	/**
	 * 获取：儿童姓名
	 */
	public String getErtongxingming() {
		return ertongxingming;
	}
				
	
	/**
	 * 设置：接种编号
	 */
	 
	public void setJiezhongbianhao(String jiezhongbianhao) {
		this.jiezhongbianhao = jiezhongbianhao;
	}
	
	/**
	 * 获取：接种编号
	 */
	public String getJiezhongbianhao() {
		return jiezhongbianhao;
	}
				
	
	/**
	 * 设置：出生日期
	 */
	 
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
				
	
	/**
	 * 设置：儿童性别
	 */
	 
	public void setErtongxingbie(String ertongxingbie) {
		this.ertongxingbie = ertongxingbie;
	}
	
	/**
	 * 获取：儿童性别
	 */
	public String getErtongxingbie() {
		return ertongxingbie;
	}
				
	
	/**
	 * 设置：孕期周数
	 */
	 
	public void setYunqizhoushu(String yunqizhoushu) {
		this.yunqizhoushu = yunqizhoushu;
	}
	
	/**
	 * 获取：孕期周数
	 */
	public String getYunqizhoushu() {
		return yunqizhoushu;
	}
				
	
	/**
	 * 设置：出生身高
	 */
	 
	public void setChushengshengao(String chushengshengao) {
		this.chushengshengao = chushengshengao;
	}
	
	/**
	 * 获取：出生身高
	 */
	public String getChushengshengao() {
		return chushengshengao;
	}
				
	
	/**
	 * 设置：出生体重
	 */
	 
	public void setChushengtizhong(String chushengtizhong) {
		this.chushengtizhong = chushengtizhong;
	}
	
	/**
	 * 获取：出生体重
	 */
	public String getChushengtizhong() {
		return chushengtizhong;
	}
				
	
	/**
	 * 设置：儿童过敏史
	 */
	 
	public void setErtongguominshi(String ertongguominshi) {
		this.ertongguominshi = ertongguominshi;
	}
	
	/**
	 * 获取：儿童过敏史
	 */
	public String getErtongguominshi() {
		return ertongguominshi;
	}
				
	
	/**
	 * 设置：监护人电话
	 */
	 
	public void setJianhurendianhua(String jianhurendianhua) {
		this.jianhurendianhua = jianhurendianhua;
	}
	
	/**
	 * 获取：监护人电话
	 */
	public String getJianhurendianhua() {
		return jianhurendianhua;
	}
				
	
	/**
	 * 设置：儿童关系
	 */
	 
	public void setErtongguanxi(String ertongguanxi) {
		this.ertongguanxi = ertongguanxi;
	}
	
	/**
	 * 获取：儿童关系
	 */
	public String getErtongguanxi() {
		return ertongguanxi;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}

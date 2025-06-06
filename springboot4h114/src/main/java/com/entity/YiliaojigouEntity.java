package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 医疗机构
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
@TableName("yiliaojigou")
public class YiliaojigouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiliaojigouEntity() {
		
	}
	
	public YiliaojigouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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

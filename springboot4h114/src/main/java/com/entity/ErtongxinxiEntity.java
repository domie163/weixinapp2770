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
 * 儿童信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:09
 */
@TableName("ertongxinxi")
public class ErtongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ErtongxinxiEntity() {
		
	}
	
	public ErtongxinxiEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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

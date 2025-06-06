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
 * 疫苗信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:09
 */
@TableName("yimiaoxinxi")
public class YimiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YimiaoxinxiEntity() {
		
	}
	
	public YimiaoxinxiEntity(T t) {
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
	 * 疫苗名称
	 */
					
	private String yimiaomingcheng;
	
	/**
	 * 生产商
	 */
					
	private String shengchanshang;
	
	/**
	 * 生产批次
	 */
					
	private String shengchanpici;
	
	/**
	 * 存储条件
	 */
					
	private String cunchutiaojian;
	
	/**
	 * 用法
	 */
					
	private String yongfa;
	
	/**
	 * 疫苗类型
	 */
					
	private String yimiaoleixing;
	
	/**
	 * 付费方式
	 */
					
	private String fufeifangshi;
	
	/**
	 * 接种针数
	 */
					
	private String jiezhongzhenshu;
	
	/**
	 * 接种间隔
	 */
					
	private String jiezhongjiange;
	
	/**
	 * 常见反应
	 */
					
	private String changjianfanying;
	
	/**
	 * 接种前禁忌
	 */
					
	private String jiezhongqianjinji;
	
	/**
	 * 疫苗介绍
	 */
					
	private String yimiaojieshao;
	
	/**
	 * 疫苗图片
	 */
					
	private String yimiaotupian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：疫苗名称
	 */
	public void setYimiaomingcheng(String yimiaomingcheng) {
		this.yimiaomingcheng = yimiaomingcheng;
	}
	/**
	 * 获取：疫苗名称
	 */
	public String getYimiaomingcheng() {
		return yimiaomingcheng;
	}
	/**
	 * 设置：生产商
	 */
	public void setShengchanshang(String shengchanshang) {
		this.shengchanshang = shengchanshang;
	}
	/**
	 * 获取：生产商
	 */
	public String getShengchanshang() {
		return shengchanshang;
	}
	/**
	 * 设置：生产批次
	 */
	public void setShengchanpici(String shengchanpici) {
		this.shengchanpici = shengchanpici;
	}
	/**
	 * 获取：生产批次
	 */
	public String getShengchanpici() {
		return shengchanpici;
	}
	/**
	 * 设置：存储条件
	 */
	public void setCunchutiaojian(String cunchutiaojian) {
		this.cunchutiaojian = cunchutiaojian;
	}
	/**
	 * 获取：存储条件
	 */
	public String getCunchutiaojian() {
		return cunchutiaojian;
	}
	/**
	 * 设置：用法
	 */
	public void setYongfa(String yongfa) {
		this.yongfa = yongfa;
	}
	/**
	 * 获取：用法
	 */
	public String getYongfa() {
		return yongfa;
	}
	/**
	 * 设置：疫苗类型
	 */
	public void setYimiaoleixing(String yimiaoleixing) {
		this.yimiaoleixing = yimiaoleixing;
	}
	/**
	 * 获取：疫苗类型
	 */
	public String getYimiaoleixing() {
		return yimiaoleixing;
	}
	/**
	 * 设置：付费方式
	 */
	public void setFufeifangshi(String fufeifangshi) {
		this.fufeifangshi = fufeifangshi;
	}
	/**
	 * 获取：付费方式
	 */
	public String getFufeifangshi() {
		return fufeifangshi;
	}
	/**
	 * 设置：接种针数
	 */
	public void setJiezhongzhenshu(String jiezhongzhenshu) {
		this.jiezhongzhenshu = jiezhongzhenshu;
	}
	/**
	 * 获取：接种针数
	 */
	public String getJiezhongzhenshu() {
		return jiezhongzhenshu;
	}
	/**
	 * 设置：接种间隔
	 */
	public void setJiezhongjiange(String jiezhongjiange) {
		this.jiezhongjiange = jiezhongjiange;
	}
	/**
	 * 获取：接种间隔
	 */
	public String getJiezhongjiange() {
		return jiezhongjiange;
	}
	/**
	 * 设置：常见反应
	 */
	public void setChangjianfanying(String changjianfanying) {
		this.changjianfanying = changjianfanying;
	}
	/**
	 * 获取：常见反应
	 */
	public String getChangjianfanying() {
		return changjianfanying;
	}
	/**
	 * 设置：接种前禁忌
	 */
	public void setJiezhongqianjinji(String jiezhongqianjinji) {
		this.jiezhongqianjinji = jiezhongqianjinji;
	}
	/**
	 * 获取：接种前禁忌
	 */
	public String getJiezhongqianjinji() {
		return jiezhongqianjinji;
	}
	/**
	 * 设置：疫苗介绍
	 */
	public void setYimiaojieshao(String yimiaojieshao) {
		this.yimiaojieshao = yimiaojieshao;
	}
	/**
	 * 获取：疫苗介绍
	 */
	public String getYimiaojieshao() {
		return yimiaojieshao;
	}
	/**
	 * 设置：疫苗图片
	 */
	public void setYimiaotupian(String yimiaotupian) {
		this.yimiaotupian = yimiaotupian;
	}
	/**
	 * 获取：疫苗图片
	 */
	public String getYimiaotupian() {
		return yimiaotupian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}

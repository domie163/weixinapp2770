package com.entity.vo;

import com.entity.ErtongjiezhongshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 儿童接种史
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-02 02:14:10
 */
public class ErtongjiezhongshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 儿童姓名
	 */
	
	private String ertongxingming;
		
	/**
	 * 接种编号
	 */
	
	private String jiezhongbianhao;
		
	/**
	 * 监护人姓名
	 */
	
	private String jianhurenxingming;
		
	/**
	 * 出生日期
	 */
	
	private String chushengriqi;
		
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
	 * 接种针数
	 */
	
	private String jiezhongzhenshu;
		
	/**
	 * 接种时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhongshijian;
		
	/**
	 * 不良反应
	 */
	
	private String buliangfanying;
		
	/**
	 * 下次接种
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiacijiezhong;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
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
	 * 设置：出生日期
	 */
	 
	public void setChushengriqi(String chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public String getChushengriqi() {
		return chushengriqi;
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
	 * 设置：接种时间
	 */
	 
	public void setJiezhongshijian(Date jiezhongshijian) {
		this.jiezhongshijian = jiezhongshijian;
	}
	
	/**
	 * 获取：接种时间
	 */
	public Date getJiezhongshijian() {
		return jiezhongshijian;
	}
				
	
	/**
	 * 设置：不良反应
	 */
	 
	public void setBuliangfanying(String buliangfanying) {
		this.buliangfanying = buliangfanying;
	}
	
	/**
	 * 获取：不良反应
	 */
	public String getBuliangfanying() {
		return buliangfanying;
	}
				
	
	/**
	 * 设置：下次接种
	 */
	 
	public void setXiacijiezhong(Date xiacijiezhong) {
		this.xiacijiezhong = xiacijiezhong;
	}
	
	/**
	 * 获取：下次接种
	 */
	public Date getXiacijiezhong() {
		return xiacijiezhong;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}

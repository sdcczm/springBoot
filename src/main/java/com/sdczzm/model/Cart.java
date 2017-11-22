package com.sdczzm.model;

import java.util.Date;


/**
 * 
 * @JsonIgnore
 * @ToString
 * @CreatedDate
 * @LastModifiedDate
 * @author QiHuifang
 *
 *
 *
 *
 *dao层  CommandLineRunner
 *
 *Stream.of().forEach()
 *
 *
 *页面
 *直接带链接 怎么实现的 ——links
 *
 *
 *生成API说明文档  swagger
 *
 *
 *开发工具 pom 类提醒？
 *
 *sample_table 快捷键
 *
 *thymeleaf 页面标签使用前要引用 xmlns
 *thymeleaf 插件 要加MVN依赖
 *thymeleaf
 *
 *
 *sample_user_actions 生成增删改查方法
 */


public class Cart {
	
	private Integer id;
	
	private Integer userId;
	
	private Integer CommodityItemId;
	
	private Integer quantity;
		
	private String activeState;
	
	private Date createDate;
	
	private String createBy;
		
	private Date updateDate;
	
	private String updateBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCommodityItemId() {
		return CommodityItemId;
	}

	public void setCommodityItemId(Integer commodityItemId) {
		CommodityItemId = commodityItemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getActiveState() {
		return activeState;
	}

	public void setActiveState(String activeState) {
		this.activeState = activeState;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}

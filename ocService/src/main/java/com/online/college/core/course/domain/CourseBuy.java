package com.online.college.core.course.domain;

import java.math.BigDecimal;

import com.online.college.common.orm.BaseEntity;

public class CourseBuy  extends BaseEntity{
	
	/**
	*用户id
	**/
	private Long userId;
	
	/**
	*课程id
	**/
	private Long courseId;
	
	/**
	*课程价格
	**/
	private BigDecimal price;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
}

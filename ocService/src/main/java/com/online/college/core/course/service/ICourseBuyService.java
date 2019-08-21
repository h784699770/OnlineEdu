package com.online.college.core.course.service;

import java.util.List;

import com.online.college.core.course.domain.CourseBuy;

public interface ICourseBuyService {

	/**
	*根据用户ID获取购买课程
	**/
	public List<CourseBuy> getById(Long id);
	
	/**
	*创建新记录
	**/
	public void create(CourseBuy entity);
}

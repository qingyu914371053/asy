package com.ssy.asy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ssy.asy.entity.User;

@Mapper
public interface UserDao {
	
	@Select("select id,lastname,workcode,mobile,email,password,jobtitles,joblevel,department,subcompany from user where id =#{id} ")
	public User getUser(@Param("id") long id);
	
}

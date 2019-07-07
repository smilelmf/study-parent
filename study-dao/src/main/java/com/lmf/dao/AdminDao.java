package com.lmf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.lmf.pojo.Admin;

public interface AdminDao {
	/**
	   *     查询管理员身份是否存在
	 * @param admin
	 * @return
	 */
	@Select("select id,account,password,username from admin where account=#{account} and password=#{password}")
    public Admin selectAdmin(Admin admin);
	@Insert("insert into admin(account,password,username) values(#{account},#{password},#{username})")
	public int insertAdmin(Admin admin);
	@Select("select * from admin")
	public List<Admin> selectAll();
}

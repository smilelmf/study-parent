package com.lmf.service;

import java.util.List;

import com.lmf.pojo.Admin;

public interface AdminService {
	/**
	 * 管理员登录
	 * @param admin
	 * @return
	 */
   public Admin adminLogin(Admin admin);
   
   public int insertAdmin(Admin admin);
   
   public List<Admin> selectAll();
}

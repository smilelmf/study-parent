package com.lmf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lmf.dao.AdminDao;
import com.lmf.pojo.Admin;
import com.lmf.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	@Resource
	private AdminDao adminDao;

	@Override
	public Admin adminLogin(Admin admin) {
		return adminDao.selectAdmin(admin);
	}

	@Override
	public int insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.insertAdmin(admin);
	}

	@Override
	public List<Admin> selectAll() {
		// TODO Auto-generated method stub
		return adminDao.selectAll();
	}

}

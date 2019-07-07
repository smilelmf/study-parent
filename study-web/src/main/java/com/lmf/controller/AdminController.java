package com.lmf.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lmf.pojo.Admin;
import com.lmf.service.AdminService;

@Controller
public class AdminController {
	@Resource
	private AdminService adminService;

	@RequestMapping("adminLogin")
	public String adminLogin(String account, String password, Model model) {
		Admin admin = adminService.adminLogin(new Admin(account, password));
		model.addAttribute("admin", admin);
		if (admin == null) {
			return "index.jsp";
		}
		return "redirect:/selectAdmin";
	}

	@RequestMapping("selectAdmin")
	public String selectAdmin(Model model) {
		model.addAttribute("list", adminService.selectAll());
		return "main.jsp";
	}

}

package com.lmf.pojo;

/**
 * 管理员类
 * 
 * @author admin
 *
 */
public class Admin {
	private int id;
	private String account;
	private String password;
	private String username;

	public Admin(int id, String account, String password, String username) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.username = username;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Admin(String account, String password) {
		this.account = account;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}

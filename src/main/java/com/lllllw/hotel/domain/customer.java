package com.lllllw.hotel.domain;

/**
 * 顾客实体类
 *
 */
public class customer {
	private String c_id;// 顾客ID
	private String c_name;// 顾客姓名
	private String c_password;// 顾客登录密码
	private String c_phone;// 顾客电话
	private String c_email;// 顾客电子邮件
	private String c_gender;// 性别

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_password() {
		return c_password;
	}

	public void setC_password(String c_password) {
		this.c_password = c_password;
	}

	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}

	public String getC_gender() {
		return c_gender;
	}

	public void setC_gender(String c_gender) {
		this.c_gender = c_gender;
	}

}

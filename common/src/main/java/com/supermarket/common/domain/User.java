package com.supermarket.common.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * 用户bean，对应t_user
 */
@Setter
@Getter
public class User {
	private String userId;

	@NotBlank(message = "用户名不能为空")
	private String userName;

	@NotBlank(message = "密码不能为空")
	private String userPassword;

	@NotBlank(message = "昵称不能为空")
	private String userNickname;

	@Email(message = "邮箱格式不对")
	private String userEmail;

	/**
	 * 0: 游客
	 * 1: 买家
	 * 2: 卖家
	 * 3: 预留
	 * 4: 管理员
	 * 5: 根用户
	 */
	private Integer userType = 0;

	public User() {
	}

	public User(String userId, String userName, String userPassword, String userNickname, String userEmail, Integer userType) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userNickname = userNickname;
		this.userEmail = userEmail;
		this.userType = userType;
	}
}

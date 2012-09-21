package com.github.nagaseyasuhito.velonica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.github.nagaseyasuhito.narcissus.entity.BaseManagedEntity;

/**
 * ユーザーエンティティ。
 * 
 * @author nagaseyasuhito
 */
@Entity
public class User extends BaseManagedEntity {
	// @Entity
	// public static class Removed extends User {
	// private static final long serialVersionUID = 1L;
	// }

	private static final long serialVersionUID = 1L;

	/**
	 * 所属団体。
	 */
	@ManyToOne(optional = false)
	private Company company;

	/**
	 * メールアドレス。
	 */
	@Column(nullable = false)
	private String mailAddress;

	/**
	 * パスワード。
	 */
	@Column(nullable = false)
	private String password;

	public Company getCompany() {
		return this.company;
	}

	public String getMailAddress() {
		return this.mailAddress;
	}

	public String getPassword() {
		return this.password;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

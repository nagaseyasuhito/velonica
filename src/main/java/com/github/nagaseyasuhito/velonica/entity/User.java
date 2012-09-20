package com.github.nagaseyasuhito.velonica.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.github.nagaseyasuhito.narcissus.entity.BaseManagedEntity;

/**
 * ユーザーエンティティ。
 * 
 * @author nagaseyasuhito
 */
@Entity
public class User extends BaseManagedEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 生年月日。
	 */
	@Column
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	/**
	 * メールアドレス。
	 */
	@Column(nullable = false, unique = true)
	private String mailAddress;

	/**
	 * パスワード。
	 */
	@Column(nullable = false)
	private String password;

	public Date getBirthDate() {
		return this.birthDate;
	}

	public String getMailAddress() {
		return this.mailAddress;
	}

	public String getPassword() {
		return this.password;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

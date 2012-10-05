package com.github.nagaseyasuhito.velonica.entity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.github.nagaseyasuhito.narcissus.entity.BaseManagedEntity;

@MappedSuperclass
public abstract class Person extends BaseManagedEntity {
	private static final long serialVersionUID = 1L;

	public static enum Gender {
		FEMALE, MALE;

		public static List<Gender> valuesAsList() {
			return Arrays.asList(MALE, FEMALE);
		}
	}

	@Column
	@Lob
	private String address;

	@Column
	@Temporal(TemporalType.DATE)
	private Date birthDay;

	@Column
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column
	@Lob
	private String nameKana;

	@Column
	private String phoneNumber;

	@Column
	private String postalCode;

	public String getAddress() {
		return this.address;
	}

	public Date getBirthDay() {
		return this.birthDay;
	}

	public Gender getGender() {
		return this.gender;
	}

	public String getNameKana() {
		return this.nameKana;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}

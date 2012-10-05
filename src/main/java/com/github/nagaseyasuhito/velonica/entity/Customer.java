package com.github.nagaseyasuhito.velonica.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Customer extends Person {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private Boolean announceAccepted;

	@Column
	@Lob
	private String mailAddress;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Order> orders = new ArrayList<Order>();

	public String getMailAddress() {
		return this.mailAddress;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public Boolean isAnnounceAccepted() {
		return this.announceAccepted;
	}

	public void setAnnounceAccepted(Boolean announceAccepted) {
		this.announceAccepted = announceAccepted;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}

package com.github.nagaseyasuhito.velonica.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Stage extends EventMaster {
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "stage", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Order> orders = new ArrayList<Order>();

	@OneToMany(mappedBy = "stage", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Ticket> tickets = new ArrayList<Ticket>();

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	public List<Order> getOrders() {
		return this.orders;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}

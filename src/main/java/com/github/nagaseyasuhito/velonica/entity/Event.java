package com.github.nagaseyasuhito.velonica.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.github.nagaseyasuhito.narcissus.entity.BaseManagedEntity;

@Entity
public class Event extends BaseManagedEntity {
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("order")
	private List<Delivery> deliveries = new ArrayList<Delivery>();

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Order> orders = new ArrayList<Order>();

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("order")
	private List<Payment> payments = new ArrayList<Payment>();

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("order")
	private List<Price> prices = new ArrayList<Price>();

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("timestamp")
	private List<Stage> stages = new ArrayList<Stage>();

	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("order")
	private List<Ticket> tickets = new ArrayList<Ticket>();

	public List<Delivery> getDeliveries() {
		return this.deliveries;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public List<Payment> getPayments() {
		return this.payments;
	}

	public List<Price> getPrices() {
		return this.prices;
	}

	public List<Stage> getStages() {
		return this.stages;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setDeliveries(List<Delivery> deliveries) {
		this.deliveries = deliveries;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
}

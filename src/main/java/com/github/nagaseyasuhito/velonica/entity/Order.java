package com.github.nagaseyasuhito.velonica.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.github.nagaseyasuhito.narcissus.entity.BaseManagedEntity;

@Entity
@Table(name = "Order_")
public class Order extends BaseManagedEntity {
	private static final long serialVersionUID = 1L;

	@ManyToOne(optional = false)
	private Customer customer;

	@ManyToOne(optional = false)
	private Delivery delivery;

	@ManyToOne(optional = false)
	private Event event;

	@Column
	@Lob
	private String note;

	@Column(nullable = false)
	private Long numberOfTickets;

	@ManyToOne(optional = false)
	private Payment payment;

	@ManyToOne(optional = false)
	private Price price;

	@ManyToOne(optional = false)
	private Stage stage;

	@ManyToMany
	private List<Ticket> ticket = new ArrayList<Ticket>();

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	public Customer getCustomer() {
		return this.customer;
	}

	public Delivery getDelivery() {
		return this.delivery;
	}

	public Event getEvent() {
		return this.event;
	}

	public String getNote() {
		return this.note;
	}

	public Long getNumberOfTickets() {
		return this.numberOfTickets;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public Price getPrice() {
		return this.price;
	}

	public Stage getStage() {
		return this.stage;
	}

	public List<Ticket> getTicket() {
		return this.ticket;
	}

	public User getUser() {
		return this.user;
	}

	public boolean isReserved() {
		return this.getTicket().size() == this.getNumberOfTickets();
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setNumberOfTickets(Long numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

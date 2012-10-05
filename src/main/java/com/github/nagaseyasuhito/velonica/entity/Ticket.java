package com.github.nagaseyasuhito.velonica.entity;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import com.github.nagaseyasuhito.narcissus.entity.BaseManagedEntity;

@Entity
public class Ticket extends BaseManagedEntity {
	private static final long serialVersionUID = 1L;

	public static enum State {
		COMMITED, EMPTY, RESERVED;

		public static List<State> valuesAsList() {
			return Arrays.asList(EMPTY, RESERVED, COMMITED);
		}
	}

	@Column(name = "column_", nullable = false)
	private Long column;

	@ManyToOne
	private Customer customer;

	@ManyToOne(optional = false)
	private Event event;

	@Column(nullable = false)
	private String name;

	@ManyToOne
	private Order order;

	@Column(nullable = false)
	private Boolean payed;

	@ManyToOne(optional = false)
	private Price price;

	@Column(nullable = false)
	private Long row;

	@ManyToOne(optional = false)
	private Stage stage;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private State state;

	public Long getColumn() {
		return this.column;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public Event getEvent() {
		return this.event;
	}

	public String getName() {
		return this.name;
	}

	public Order getOrder() {
		return this.order;
	}

	public Boolean getPayed() {
		return this.payed;
	}

	public Price getPrice() {
		return this.price;
	}

	public Long getRow() {
		return this.row;
	}

	public Stage getStage() {
		return this.stage;
	}

	public State getState() {
		return this.state;
	}

	public void setColumn(Long column) {
		this.column = column;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public void setName(String seat) {
		this.name = seat;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setPayed(Boolean payed) {
		this.payed = payed;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public void setRow(Long row) {
		this.row = row;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setState(State state) {
		this.state = state;
	}
}

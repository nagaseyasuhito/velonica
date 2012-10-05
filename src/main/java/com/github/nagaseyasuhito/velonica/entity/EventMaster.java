package com.github.nagaseyasuhito.velonica.entity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.github.nagaseyasuhito.narcissus.entity.BaseManagedEntity;

@MappedSuperclass
public abstract class EventMaster extends BaseManagedEntity {
	private static final long serialVersionUID = 1L;

	@ManyToOne(optional = false)
	private Event event;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Long order;

	public Event getEvent() {
		return this.event;
	}

	public String getName() {
		return this.name;
	}

	public Long getOrder() {
		return this.order;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrder(Long order) {
		this.order = order;
	}
}
package com.github.nagaseyasuhito.velonica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Price extends EventMaster {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private Long value;

	public Long getValue() {
		return this.value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
}

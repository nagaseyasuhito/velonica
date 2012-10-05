package com.github.nagaseyasuhito.velonica.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.github.nagaseyasuhito.narcissus.entity.BaseManagedEntity;
import com.google.common.collect.Sets;

/**
 * 団体エンティティ。
 */
@Entity
public class Company extends BaseManagedEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 団体名。
	 */
	@Column(nullable = false)
	private String name;

	/**
	 * 所属ユーザー。
	 */
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<User> users = Sets.newHashSet();

	public String getName() {
		return this.name;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}

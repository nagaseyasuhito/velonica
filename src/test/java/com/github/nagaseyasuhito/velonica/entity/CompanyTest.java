package com.github.nagaseyasuhito.velonica.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompanyTest {

	private EntityManagerFactory entityManagerFactory;

	@Before
	public void before() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("default");

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@After
	public void after() {
		this.entityManagerFactory.close();
	}

	@Test
	public void test() {
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		Company company = new Company();
		company.setName("company name");

		entityManager.persist(company);

		entityManager.getTransaction().commit();
	}
}

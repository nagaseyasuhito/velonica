package com.github.nagaseyasuhito.velonica.dao;

import com.github.nagaseyasuhito.narcissus.dao.BaseManagedDao;
import com.github.nagaseyasuhito.velonica.entity.Company;

public class CompanyDao extends BaseManagedDao<Company> {

	@Override
	public Class<Company> getEntityClass() {
		return Company.class;
	}
}

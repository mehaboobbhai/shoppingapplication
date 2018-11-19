package com.teamsankya.shoppingapplication.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.shoppingapplication.controller.SearchProductController;
import com.teamsankya.shoppingapplication.dto.ProductDto;



public class SearchProductDaoImpl implements SearchProductDao {
	final Logger LOGGER = Logger.getLogger(SearchProductDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public SearchProductDaoImpl() {
	}

	
	public List<ProductDto> searchProduct(String pName) {
	String qry = "from ProductDto  where pName='"+pName+"'";
		Session session = sessionFactory.openSession();
		LOGGER.info("product name: " +pName);
		LOGGER.info("class name: " + this.getClass().getSimpleName());
		LOGGER.info(session);
		Query query = session.createQuery(qry);
		List<ProductDto> dto = query.list();
		LOGGER.info("list of product details " + dto);
		return dto;
	}
}


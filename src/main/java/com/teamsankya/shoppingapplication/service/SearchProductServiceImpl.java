package com.teamsankya.shoppingapplication.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


import com.teamsankya.shoppingapplication.dao.SearchProductDaoImpl;
import com.teamsankya.shoppingapplication.dto.ProductDto;



public class SearchProductServiceImpl implements SearchProductService {

	
	final Logger LOGGER = Logger.getLogger(SearchProductServiceImpl.class);
	
	
	@Autowired
	private SearchProductDaoImpl daoImpl;
	
	@Override
	public List<ProductDto> searchProduct(String pName) {
		LOGGER.info("product name: " +pName);
		LOGGER.info("class name: " + this.getClass().getSimpleName());
		
		List<ProductDto> dto=daoImpl.searchProduct(pName);
		LOGGER.info(" list of product details in service layer " + dto);
		return dto;
	}
	

}

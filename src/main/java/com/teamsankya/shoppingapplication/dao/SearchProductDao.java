package com.teamsankya.shoppingapplication.dao;

import java.util.List;

import com.teamsankya.shoppingapplication.dto.ProductDto;

public interface SearchProductDao {
	
	public List<ProductDto> searchProduct(String pName);

}

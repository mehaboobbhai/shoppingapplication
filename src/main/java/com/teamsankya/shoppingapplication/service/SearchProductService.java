package com.teamsankya.shoppingapplication.service;

import java.util.List;

import com.teamsankya.shoppingapplication.dto.ProductDto;

public interface SearchProductService {
	
	public List<ProductDto> searchProduct(String pName);
}

package com.teamsankya.shoppingapplication.controller;

import java.util.List;

import javax.servlet.ServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teamsankya.shoppingapplication.dao.SearchProductDaoImpl;
import com.teamsankya.shoppingapplication.dto.ProductDto;
import com.teamsankya.shoppingapplication.service.SearchProductServiceImpl;

@Controller
public class SearchProductController {

	@Autowired
	private SearchProductServiceImpl serviceImpl;

	public SearchProductController() {
	}

	final Logger LOGGER = Logger.getLogger(SearchProductController.class);

	@RequestMapping(method = RequestMethod.GET, path = "getproduct")
	public ModelAndView searchProduct(@RequestParam("product") String pName, ModelAndView map) {
		LOGGER.info("product name: " + pName);
//		int page=6;
		LOGGER.info("class name: " + this.getClass().getSimpleName());
		List<ProductDto> dto = serviceImpl.searchProduct(pName);
		/*PagedListHolder<ProductDto> holder = new PagedListHolder<ProductDto>(dto);
		holder.setPageSize(6);
		int pages = holder.getPageCount();
		LOGGER.info("list of  :" + pages);*/
		String pname = null;
		for (ProductDto productDto : dto) {
			pname = productDto.getpName();
			LOGGER.info(pname);
		}
		if (pname != null && pname.equals(pName)) {
			/*map.setViewName("productlist");
			if ( page < 1 || page > holder.getPageCount()) {
				holder.setPage(0);
				map.addObject("msg", holder.getPageCount());
			} else if (page <= holder.getPageCount()) {
				holder.setPage(page - 1);
				map.addObject("msg", holder.getPageList());
			}
			map.addObject("page", page);
			map.addObject("productlist", dto);*/
//			return map;
			return new ModelAndView("productlist", "msg", dto);
		} else {
			return new ModelAndView("failure", "msg", "no result found");
		}
	}
}

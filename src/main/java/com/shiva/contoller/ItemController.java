package com.shiva.contoller;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.domain.Category;
import com.shiva.service.ItemService;

@Controller
@RestController
@RequestMapping("/items")

public class ItemController {
	
private static Logger logger=LoggerFactory.getLogger(ItemController.class);

@Autowired
private ItemService itemService;
	
	@RequestMapping("/categories")
	public List<Category> getCategory(){
		
		List<Category>categories=new ArrayList<Category>();
		
		try{
			categories=itemService.getCategory();
			logger.info("List of category returned");
		}
		catch(Exception e){
			logger.error("Not able to return list of category",e);
		}
		return categories;
		
	}

}

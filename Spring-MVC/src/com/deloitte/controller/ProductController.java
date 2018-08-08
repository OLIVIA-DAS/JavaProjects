package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.entities.Product;

@Controller
public class ProductController {
	@RequestMapping(value = "/product", method= RequestMethod.GET)
	     public ModelAndView Product() {
		Product product= new Product();
		product.setId(4);
	    	 return new ModelAndView("product", "command", product );
	     }
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("Spring-MVC") Product product1,ModelMap model) {
		model.addAttribute("productName", product1.getProductName());
		model.addAttribute("price", product1.getPrice());
		model.addAttribute("id", product1.getId());
		return "result";

	}
}



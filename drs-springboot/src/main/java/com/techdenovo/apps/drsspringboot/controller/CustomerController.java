package com.techdenovo.apps.drsspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techdenovo.apps.drsspringboot.model.Customer;
import com.techdenovo.apps.drsspringboot.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Customer> listCustomers = customerService.listAll();
	    model.addAttribute("listCustomers", listCustomers);
	     
	    return "index";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	    Customer customer = new Customer();
	    model.addAttribute("customer", customer);
	     
	    return "add-customer";
	}
}

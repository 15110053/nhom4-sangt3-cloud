package webusingsql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webusingsql.service.itemServices;

@Controller
public class itemController {
	@Autowired
	itemServices service;
	
	@RequestMapping(value="/items", method = RequestMethod.GET)
	public String GetItems(Model model) {
		List listItems = service.ServiceGetListItems();
		model.addAttribute("items", listItems);
		return "items";
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String OpenItems(Model model) {
		return "index";
	}

}

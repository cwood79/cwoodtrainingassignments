package com.cg.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bean.Product;
import com.cg.service.ProductService;

@Controller
public class ProductController {

	ProductService service = new ProductService();
	
	@RequestMapping("/products")
	public String getAllProducts(Model m) {
		m.addAttribute("products",service.getAll());
		return "home";
	}
	
	@RequestMapping("/add")
	public String addProduct(Model m) {
		m.addAttribute("command", new Product());
		return "add_product";
	}
	
	@RequestMapping(value="/addp", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("pro") Product p, BindingResult br) {
		if(br.hasErrors()) {
			return "redirect:/add";
		}
		service.add(p);
		return "redirect:/products";
	}
	
	@RequestMapping("/remove")
	public String removeProduct(Model m) {
		m.addAttribute("command", new Product());
		return "remove_product";
	}
	
	@RequestMapping(value="/removep", method=RequestMethod.POST)
	public String remove(@ModelAttribute("pro") Product p, BindingResult br) {
		if(br.hasErrors()) {
			return "redirect:/remove";
		}
		Integer id = p.getId();
		service.remove(id);
		return "redirect:/products";
	}
	
	@RequestMapping("/update")
	public String updateProduct(Model m) {
		m.addAttribute("command", new Product());
		return "update_product";
	}
	
	@RequestMapping(value="/updatep", method=RequestMethod.POST)
	public String update(@ModelAttribute("pro") Product p, BindingResult br) {
		if(br.hasErrors()) {
			return "redirect:/update";
		}
		service.update(p);
		return "redirect:/products";
	}
	
}

package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bean.Trainee;
import com.cg.service.TraineeService;


@Controller
public class TraineeController {

	TraineeService service = new TraineeService();
	
	@RequestMapping("/retrieve_all")
	public String getAllTrainees(Model m) {
		m.addAttribute("trainees",service.getAll());
		return "retrieve_trainees";
	}
	
	@RequestMapping("/add")
	public String addTrainee(Model m) {
		m.addAttribute("command", new Trainee());
		return "add_trainee";
	}
	
	@RequestMapping(value="addt", method=RequestMethod.POST)
	public String add(@ModelAttribute("pro") Trainee t, BindingResult br) {
		if(br.hasErrors()) {
			return "redirect:/add";
		}
		service.add(t);
		return "redirect:/trainees";
	}
	
	@RequestMapping("remove")
	public String removeTrainee(Model m) {
		m.addAttribute("command", new Trainee());
		return "delete_trainee";
	}
	
	@RequestMapping(value="removet", method=RequestMethod.POST)
	public String remove(@ModelAttribute("pro") Trainee t, BindingResult br) {
		if(br.hasErrors()) {
			return "redirect:/remove";
		}
		Integer id = t.getTraineeId();
		service.remove(id);
		return "redirect:/trainees";
	}
	
	@RequestMapping("/update")
	public String updateTrainee(Model m) {
		m.addAttribute("command", new Trainee());
		return "modify_trainee";
	}
	
	@RequestMapping(value="/updatet", method=RequestMethod.POST)
	public String update(@ModelAttribute("pro") Trainee t, BindingResult br) {
		if(br.hasErrors()) {
			return "redirect:/update";
		}
		service.update(t);
		return "redirect:/trainees";
	}
	
	@RequestMapping("/retrieve")
	public String retrieveTrainee(Model m) {
		m.addAttribute("command", new Trainee());
		return "retrieve_trainee";
	}
	
	@RequestMapping(value="/retrievet", method=RequestMethod.GET)
	public String retrieve(@ModelAttribute("pro") Trainee t, BindingResult br) {
		if(br.hasErrors()) {
			return "redirect:/retrieve";
		}
		service.update(t);
		return "redirect:/trainees";
	}
	
}

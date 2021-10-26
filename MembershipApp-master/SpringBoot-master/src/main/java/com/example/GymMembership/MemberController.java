package com.example.GymMembership;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Member> listMembers = service.listAll();
		model.addAttribute("listMembers", listMembers);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewMemberPage(Model model) {
		Member member = new Member();
		model.addAttribute("member", member);
		
		return "new_member";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveMember(@ModelAttribute("member") Member member) {
		service.save(member);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditMemberPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_member");
		Member member = service.get(id);
		mav.addObject("member", member);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteMember(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}
	
}

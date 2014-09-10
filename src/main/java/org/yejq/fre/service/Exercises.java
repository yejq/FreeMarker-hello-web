package org.yejq.fre.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.yejq.fre.model.Animal;

public class Exercises{
	
	public void testIf(Model model){
		model.addAttribute("user", "Big Joe");
		
		Map<String, Animal> animals = new HashMap<String, Animal>();
		animals.put("python", new Animal("python", 300, true));
		animals.put("elephant", new Animal("elephant", 400, false));
		model.addAttribute("animals", animals);
	}
	
	public void testList(Model model){
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("python", 300, true));
		animals.add(new Animal("elephant", 400, false));
		model.addAttribute("animals", animals);
	}
	
	public void testMethod(Model model){
		model.addAttribute("indexOf", new IndexOfMethod());
	}
	
	public void testVariable(Model model){
		model.addAttribute("user", "lucy");
	}
	
	public void testNamespace(Model model){
		model.addAttribute("user", "lucy");
	}
}

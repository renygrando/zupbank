package br.com.zup.zupbank.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.zupbank.model.Person;
import br.com.zup.zupbank.repository.NewHolderRepository;

@RestController
@RequestMapping("/holder")
public class NewHolder {
	
	@Autowired
	private NewHolderRepository newHolderRepository;
	
	@GetMapping
	public List<List<Person>> holders() {
		
		List<Person> persons = newHolderRepository.findAll();
		
		return Arrays.asList(persons);
	}
}

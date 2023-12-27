package com.javaExpress.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaExpress.models.Categeroy;
import com.javaExpress.services.CategeroyService;

@RestController
@RequestMapping("/categeroy")
public class CategeroyController {
	
	@Autowired
	private CategeroyService categeroyService;
	
	@PostMapping(value="/create")
	public void saveCategeroy(@RequestBody Categeroy inputcategeroy) {
		categeroyService.save(inputcategeroy);
	}
	
	@GetMapping("/get")
	public List<Categeroy> featchAllCateroy() {
		return categeroyService.findAllCategeroys();
		
	}
	@GetMapping("/get/{categeroyId}")
	public Categeroy featchCategery(@PathVariable("categeroyId") Integer id) {
		return categeroyService.featchCategeryById(id);
		
	}
	
	@PutMapping("/update/{categeroyId}")
	public Categeroy updateCategeroy(@PathVariable("categeroyId") Integer id,@RequestBody Categeroy categeroy) {
		return categeroyService.updateCategery(id,categeroy);
		
	}
	
	@DeleteMapping("/delete/{categeroyId}")
	public void deleteCategeroy(@PathVariable("categeroyId") Integer id) {
		categeroyService.deleteCategery(id);
	}
}

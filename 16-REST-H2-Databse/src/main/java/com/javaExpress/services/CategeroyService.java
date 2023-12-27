package com.javaExpress.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaExpress.exception.CategeroyNotFoundException;
import com.javaExpress.models.Categeroy;
import com.javaExpress.repository.CategeroyRepository;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategeroyService {
	
	@Autowired
	private CategeroyRepository categeroyRepository;
	
	public void save(Categeroy categeroy) {
		categeroyRepository.save(categeroy);
		log.info("categeroy object is saved in database");
	}

	public List<Categeroy> findAllCategeroys() {
		return categeroyRepository.findAll();
	}

	public Categeroy featchCategeryById(Integer categeroyId) {
		Optional<Categeroy> optional = categeroyRepository.findById(categeroyId);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			throw new CategeroyNotFoundException("Categeroy Not Found exception ="+categeroyId );
		}
	}

	public Categeroy updateCategery(Integer id, Categeroy input) {
		Categeroy dbCategery=featchCategeryById(id);
		dbCategery.setName(input.getName());
		return categeroyRepository.save(dbCategery);
		
	}

	public void deleteCategery(Integer id) {
		Categeroy categeroy=featchCategeryById(id);
		categeroyRepository.delete(categeroy);
		log.info("deleteCategery method is called");
	}

	

	
}
 
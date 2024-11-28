package com.andromeda.edash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.edash.model.Banca;
import com.andromeda.edash.services.BancaService;

@RestController
@RequestMapping(value = "/banca")
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:4200"})
public class BancaController {
	
	@Autowired
	public BancaService bancaService;
	
	@GetMapping(value = "/email/{email}")
	public ResponseEntity<Banca> findByEmail(@PathVariable(value = "userEmail") String userId){
		
		Banca banca = bancaService.findByUserEmail(userId);
		if (banca == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(banca);
	}
	
	

}

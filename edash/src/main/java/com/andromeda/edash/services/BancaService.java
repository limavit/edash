package com.andromeda.edash.services;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.edash.model.Banca;
import com.andromeda.edash.repositories.BancaRepository;
import com.andromeda.edash.repositories.UserRepository;


@Service
public class BancaService {
	@Autowired
	BancaRepository bancaRepository;
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LogAceessoService logAcesso = new LogAceessoService();
	
	private Logger logger = Logger.getLogger(BancaService.class.getName());
	
	public Banca findByUserEmail(String userEmail) {
		try {
			Banca b = bancaRepository.findByUserEmail(userEmail);
			logger.info("Banca encontrada: " + b.getId());
			logAcesso.insertLogAcesso(userRepository.findByEmail(userEmail), userEmail);
			return b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}
	
	
	
}

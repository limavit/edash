package com.andromeda.edash.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.edash.model.LogAcesso;
import com.andromeda.edash.model.User;
import com.andromeda.edash.repositories.LogAcessoRepository;
@Service
public class LogAceessoService {
	@Autowired
	LogAcessoRepository logAcessoRepository;
	
	
	User user = new User();
	LocalDateTime momentoEnvio = LocalDateTime.now();
	
	public void insertLogAcesso(User u, String method) {
	
		logAcessoRepository.save(new LogAcesso(null, method, u.getEmail(), momentoEnvio));
		
	}
	
	

}

package com.andromeda.edash.services;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.edash.exceptions.RequiredObjectIsNullException;
import com.andromeda.edash.model.User;
import com.andromeda.edash.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	LogAceessoService logAcesso = new LogAceessoService();
	@Autowired
    private EmailService emailService;
	
	private Logger logger = Logger.getLogger(UserService.class.getName());
	
	public User findUserByEmail(String email) {
		
		try {
			User u = userRepository.findByEmail(email);
			logger.info("Usuário encontrado: " + u.getId());
			logAcesso.insertLogAcesso(u, "findUserByEmail");
			return u;			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		return null;
	}
	
	public User insertUser(User user) {
		logAcesso.insertLogAcesso(user, "insertUser");
		
		if (user == null) throw new RequiredObjectIsNullException();
		userRepository.save(user);
		//Precisa de um servidor smpt para teste
		/* 
		 * String pass = PasswordGenerator.generateRandomPassword();
		String subject = "Confirmação de Cadastro";
		String text = "Olá " + user.getName() + ", seu cadastro foi efetuado com sucesso.\n "
				+ "Sua senha provisória: " + pass;		
		emailService.sendConfirmationEmail(user.getEmail(), subject, text);
		*/
		logger.info("Usuário criado: " + user.getId());
		return user;
	}
	
	
	
	
}

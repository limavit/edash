package com.andromeda.edash.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "t_logacesso")
public class LogAcesso implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "method")
	private String method;
	@Column(name = "emailuser")
	private String emailUser;
	@Column(name = "momentreq")
	private LocalDateTime momentReq;
	
	public LogAcesso(Long id, String method, String emailUser, LocalDateTime momentReq) {
		this.id = id;
		this.method = method;
		this.emailUser = emailUser;
		this.momentReq = momentReq;
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public LocalDateTime getMomentReq() {
		return momentReq;
	}

	public void setMomentReq(LocalDateTime momentReq) {
		this.momentReq = momentReq;
	}
	
	
	

}

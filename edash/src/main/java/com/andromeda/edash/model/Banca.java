package com.andromeda.edash.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_banca")
public class Banca implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valor_atual", nullable = false, precision = 15, scale = 2)
    private BigDecimal valorAtual;

    @Column(name = "ultima_atualizacao", nullable = false)
    private Timestamp ultimaAtualizacao;

    @Column(name = "user_email", nullable = false, length = 255)
    private String userEmail;
    
    

	public Banca(BigDecimal valorAtual, Timestamp ultimaAtualizacao, String userEmail) {
		super();
		this.valorAtual = valorAtual;
		this.ultimaAtualizacao = ultimaAtualizacao;
		this.userEmail = userEmail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(BigDecimal valorAtual) {
		this.valorAtual = valorAtual;
	}

	public Timestamp getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(Timestamp ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ultimaAtualizacao, userEmail, valorAtual);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banca other = (Banca) obj;
		return Objects.equals(id, other.id) && Objects.equals(ultimaAtualizacao, other.ultimaAtualizacao)
				&& Objects.equals(userEmail, other.userEmail) && Objects.equals(valorAtual, other.valorAtual);
	}



	
	
	

}

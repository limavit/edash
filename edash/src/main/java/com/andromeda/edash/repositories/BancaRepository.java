package com.andromeda.edash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andromeda.edash.model.Banca;

public interface BancaRepository extends JpaRepository<Banca, Long>{
	public Banca findByUserEmail(String userEmail);
	

}

package com.leonardoregis.demoacmeap.repositor;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoregis.demoacmeap.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Optional<Cliente> findByCpf(String cpf);
	
}
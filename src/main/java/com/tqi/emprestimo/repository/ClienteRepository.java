package com.tqi.emprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqi.emprestimo.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
}

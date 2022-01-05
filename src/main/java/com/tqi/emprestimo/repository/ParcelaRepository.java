package com.tqi.emprestimo.repository;


import com.tqi.emprestimo.models.Parcela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelaRepository extends JpaRepository<Parcela, Long> {
}

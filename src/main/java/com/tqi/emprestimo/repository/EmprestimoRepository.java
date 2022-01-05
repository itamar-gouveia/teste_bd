package com.tqi.emprestimo.repository;

import com.tqi.emprestimo.models.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}

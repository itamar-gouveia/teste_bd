package com.tqi.emprestimo.repository;

import com.tqi.emprestimo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

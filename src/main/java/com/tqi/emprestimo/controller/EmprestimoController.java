package com.tqi.emprestimo.controller;

import java.util.List;

import com.tqi.emprestimo.models.Emprestimo;
import com.tqi.emprestimo.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tqi.emprestimo.models.Cliente;
import com.tqi.emprestimo.repository.ClienteRepository;

@RestController
@RequestMapping(value="/emprestimos")
public class EmprestimoController {

    @Autowired
    EmprestimoRepository emprestimoRepository;

    @GetMapping("/todos")
    public List<Emprestimo> listarEmprestimos(){

        return emprestimoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Emprestimo listarEmprestimoId(@PathVariable  Long id) {
        return emprestimoRepository.findById(id).get();
    }

    @PostMapping("/novo")
    public Emprestimo salvarEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);

    }

    @PutMapping("/atualizar")
    public Emprestimo atualizarEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);

    }

    @DeleteMapping("/{id}")
    public void deletarEmprestimo(@PathVariable Long id) {
        emprestimoRepository.deleteById(id);

    }


}

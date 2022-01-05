package com.tqi.emprestimo.controller;

import java.util.List;
import java.util.Optional;

import com.tqi.emprestimo.models.Emprestimo;
import com.tqi.emprestimo.models.Parcela;
import com.tqi.emprestimo.repository.EmprestimoRepository;
import com.tqi.emprestimo.repository.ParcelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/parcelas")
public class ParcelaController {

    @Autowired
    ParcelaRepository parcelaRepository;

    @GetMapping("/todos")
    public List<Parcela> listarParcelas(){
        return parcelaRepository.findAll();
    }

  

    @PostMapping("/novo")
    public Parcela salvarParcela(@RequestBody Parcela parcela) {
        return parcelaRepository.save(parcela);

    }

    @PutMapping("/atualizar")
    public Parcela atualizarParcela(@RequestBody Parcela parcela) {
        return parcelaRepository.save(parcela);

    }

    @DeleteMapping("/{id}")
    public void deletarParcela(@PathVariable Long id) {
        parcelaRepository.deleteById(id);

    }


}

package com.example.gerenciamento_projetos.controllers;

import com.example.gerenciamento_projetos.models.ProjetoModel;
import com.example.gerenciamento_projetos.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<ProjetoModel> criar(@RequestBody ProjetoModel projeto) {
        ProjetoModel novo = projetoService.salvar(projeto);
        URI uri = URI.create("/projetos/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    @GetMapping
    public ResponseEntity<List<ProjetoModel>> listar() {
        return ResponseEntity.ok(projetoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoModel> buscar(@PathVariable Long id) {
        ProjetoModel projeto = projetoService.buscarPorId(id);

        if (projeto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(projeto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjetoModel> atualizar(@PathVariable Long id,
                                                  @RequestBody ProjetoModel projeto) {
        ProjetoModel atualizado = projetoService.atualizar(id, projeto);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        projetoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
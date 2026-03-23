package com.example.gerenciamento_projetos.services;

import com.example.gerenciamento_projetos.models.ProjetoModel;
import com.example.gerenciamento_projetos.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public ProjetoModel salvar(ProjetoModel projeto) {
        return projetoRepository.save(projeto);
    }

    public List<ProjetoModel> listarTodos() {
        return projetoRepository.findAll();
    }

    public ProjetoModel buscarPorId(Long id) {
        return projetoRepository.findById(id).orElse(null);
    }

    public ProjetoModel atualizar(Long id, ProjetoModel projetoAtualizado) {
        projetoAtualizado.setId(id);
        return projetoRepository.save(projetoAtualizado);
    }

    public void deletar(Long id) {
        projetoRepository.deleteById(id);
    }
}

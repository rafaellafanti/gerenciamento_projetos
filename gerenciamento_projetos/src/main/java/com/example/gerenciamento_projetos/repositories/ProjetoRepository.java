package com.example.gerenciamento_projetos.repositories;

import com.example.gerenciamento_projetos.models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {

}
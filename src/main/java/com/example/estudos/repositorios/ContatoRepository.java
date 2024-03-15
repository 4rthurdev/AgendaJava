package com.example.estudos.repositorios;

import com.example.estudos.entidades.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    Contato findByNome(String nomeExcluir);
}

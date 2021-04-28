package com.fragoso.murilo.contato.repository;

import com.fragoso.murilo.contato.model.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends JpaRepository<Contato, Long> {
    
}

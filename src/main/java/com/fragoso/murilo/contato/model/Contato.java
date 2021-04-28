package com.fragoso.murilo.contato.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
}

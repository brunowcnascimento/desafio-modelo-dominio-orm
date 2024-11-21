package com.devsuperior.desafio_modelo_dominio_orm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
}
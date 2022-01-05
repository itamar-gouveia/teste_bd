package com.tqi.emprestimo.models;

import javax.persistence.*;

@Entity
@Table(name="tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    private String username;

    private String password;

    private String authorities;

}

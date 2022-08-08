package com.carros.concessionarias.controllers.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_concessionaria")
public class Concessionaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public Concessionaria() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

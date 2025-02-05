package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.magia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String effect;

    // Constructores
    public Spell() { }

    public Spell(String name, String effect) {
        this.name = name;
        this.effect = effect;
    }

    // Getters y Setters
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
    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
}

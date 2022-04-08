package com.bootcamp.entities;

import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Comentario implements Serializable {
    private static final long serialVersionUID = 3L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;
    private Integer puntuacion;
    private LocalDate fecha;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Pizza pizza;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Usuario usuario;

    public Comentario(Long id, String texto, Integer puntuacion, LocalDate fecha, Pizza pizza, Usuario usuario) {
        this.id = id;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.pizza = pizza;
        this.usuario = usuario;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    } 
    
    
}
   

    

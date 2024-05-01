package hn.unah.lenguajes1900.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="posiciones")
public class Posicion {

    @Id
    @Column(name="codigoposicion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoPosicion;

    private int empates;

    private int ganados;

    private int perdidos;

    @Column(name="golesfavor")
    private int golesFavor;

    @Column(name="golescontra")
    private int golesContra;

    private int puntos;

    @OneToOne()
    @JoinColumn(name="codigoequipo", referencedColumnName = "codigoequipo")
    @JsonIgnore
    private Equipo codigoEquipo;

    
}

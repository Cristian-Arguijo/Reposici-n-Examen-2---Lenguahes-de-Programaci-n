package hn.unah.lenguajes1900.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "equipos")
public class Equipo {

    @Id
    @Column(name = "codigoequipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoEquipo;

    private String nombre;

    private double ataque;

    private double defensa;

    @OneToOne(mappedBy = "codigoEquipo")
    private Posicion posicion;

}

package hn.unah.lenguajes1900.demo.services;

import org.hibernate.mapping.List;

import hn.unah.lenguajes1900.demo.entities.Posicion;

public interface PosicionService {

    public List<Posicion> obtnerPosiciones();
}

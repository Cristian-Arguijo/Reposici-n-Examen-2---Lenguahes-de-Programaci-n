package hn.unah.lenguajes1900.demo.services;

import hn.unah.lenguajes1900.demo.entities.Equipo;

public interface EquipoService {

    public Equipo crearEquipo(Equipo equipo);

    public String eliminarEquipo(int codigoEquipo);

    public Equipo buscarEquipo(int codigoEquipo);


}

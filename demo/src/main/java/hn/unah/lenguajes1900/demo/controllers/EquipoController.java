package hn.unah.lenguajes1900.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.Equipo;
import hn.unah.lenguajes1900.demo.services.servicesImpl.EquipoServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/api")
public class EquipoController {

    @Autowired
    private EquipoServiceImpl equipoServiceImpl;

    @PostMapping("/equipo/crear")
    public Equipo crearEquipo(@RequestBody Equipo equipo) {

        return this.equipoServiceImpl.crearEquipo(equipo);
    }

    @GetMapping("/equipo/buscar")
    public Equipo buscarEquipo(@RequestParam int codigoEquipo) {
        return this.equipoServiceImpl.buscarEquipo(codigoEquipo);
    }

    @DeleteMapping("/equipo/eliminar")
    public String eliminarEquipo(@RequestParam int codigoEquipo) {
        return this.equipoServiceImpl.eliminarEquipo(codigoEquipo);
    }

}

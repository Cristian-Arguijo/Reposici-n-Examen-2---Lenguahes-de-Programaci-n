package hn.unah.lenguajes1900.demo.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Equipo;
import hn.unah.lenguajes1900.demo.entities.Posicion;
import hn.unah.lenguajes1900.demo.repositories.EquipoRepository;
import hn.unah.lenguajes1900.demo.repositories.PosicionRepository;
import hn.unah.lenguajes1900.demo.services.EquipoService;

@Service
public class EquipoServiceImpl implements EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private PosicionRepository posicionRepository;

    @Override
    public Equipo crearEquipo(Equipo equipo) {
        return this.equipoRepository.save(equipo);
    }

    @Override
    public String eliminarEquipo(int codigoEquipo) {
        if (this.equipoRepository.findById(codigoEquipo).isPresent()) {
            Equipo equipo = this.equipoRepository.findById(codigoEquipo).get();
            if (equipo.getPosicion() != null) {
                return "No se puede eliminar el equipo " + equipo.getNombre();
            } else {
                this.equipoRepository.deleteById(codigoEquipo);

                return "Equipo eliminado";
            }

        }

        return "El equipo no existe";
    }

    @Override
    public Equipo buscarEquipo(int codigoEquipo) {

        return this.equipoRepository.findById(codigoEquipo).get();

    }
}

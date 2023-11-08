package ar.edu.um.programacion2.anio2023.clase11.servicios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Automovil;
import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;
import ar.edu.um.programacion2.anio2023.clase11.repositorios.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutomovilDBService implements AutomovilService{
    @Autowired
    protected AutomovilRepository automovilRepository;

    @Override
    public Automovil get(long id) {
        Optional<Automovil> automovil = this.automovilRepository.findById(id);
        if(automovil.isPresent()) {
            return automovil.get();
        }
        return null;
    }

    @Override
    public void add(Automovil automovil) { this.automovilRepository.save(automovil);

    }

    @Override
    public void remove(long id) {
        Optional<Automovil> borrar = this.automovilRepository.findById(id);
        this.automovilRepository.delete(borrar.get());
    }

    @Override
    public void remove(Automovil auto) {
        this.automovilRepository.delete(auto);
    }

    @Override
    public List<Automovil> getAll() {
        List<Automovil> automoviles = this.automovilRepository.findAll();
        return automoviles;
    }

    @Override
    public List<Automovil> getPorMarca(String marca) {
        List<Automovil> automoviles = this.automovilRepository.findByMarca(marca);
        return automoviles;
    }
}

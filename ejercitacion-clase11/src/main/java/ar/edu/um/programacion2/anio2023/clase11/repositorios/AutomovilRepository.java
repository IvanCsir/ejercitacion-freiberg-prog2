package ar.edu.um.programacion2.anio2023.clase11.repositorios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutomovilRepository extends JpaRepository<Automovil, Long> {
    List<Automovil> findByMarca(String marca);
}

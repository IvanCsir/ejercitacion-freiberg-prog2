package ar.edu.um.programacion2.anio2023.clase11.servicios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Automovil;
import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;

import java.util.List;

public interface AutomovilService {
    public Automovil get(long id);
    public void add(Automovil automovil);
    public void remove(long id);
    public void remove(Automovil auto);
    public List<Automovil> getAll();
    public List<Automovil> getPorMarca(String marca);
}

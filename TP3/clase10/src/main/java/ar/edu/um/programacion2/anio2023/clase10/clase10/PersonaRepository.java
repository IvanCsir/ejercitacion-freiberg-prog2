package ar.edu.um.programacion2.anio2023.clase10.clase10;

import java.util.List;

public interface PersonaRepository {
    public Persona get(int codigo);
    public void add(Persona persona);
    public void remove(int codigo);
    public void remove(Persona p);
    public List<Persona> getAll();
}

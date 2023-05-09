package ar.edu.um.programacion2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    protected String nombre;
    protected String marca;
    protected int precio;


    @Override
    public String toString(){
        return ("Producto: " + getNombre() + "\n Marca: " + getMarca() + "\n Precio: " + getPrecio());
    }
}


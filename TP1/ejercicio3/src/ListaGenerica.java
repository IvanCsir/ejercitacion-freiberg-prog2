import org.w3c.dom.ls.LSOutput;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGenerica<T extends Comparable<T>> {
    private ArrayList<T> listaEmpleados;

    public ListaGenerica() {
        listaEmpleados = new ArrayList<T>();
    }
    /*1*/
    public void agregar(T elemento) {
        listaEmpleados.add(elemento);
    }
/*2*/
    public void obtenerLista(){
        for (int iterador=0; iterador < listaEmpleados.size();iterador++){
            System.out.println(listaEmpleados.toString());
        }
    }
    /*3*/
    public int tamanio() {
        return listaEmpleados.size();
    }
    /*4*/
    public void agregarElementoPrimerPosicion(T empleado){
        listaEmpleados.add(0,empleado);
    }
    /*5*/
    public void ordernar(){
        Collections.sort(listaEmpleados);
    }
    /*6*/
    public void desordenar(){
        Collections.shuffle(listaEmpleados);
    }
    /*7*/
    public void agregarElementoIndice(int indice, T empleado) throws Exception{

        try {
            listaEmpleados.add(indice, empleado);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("No existe esa posicion");
            throw new RuntimeException();
        }

    }
    /*8*/
    public void devolverObjetoPosicion(int indice){
        System.out.println( listaEmpleados.get(indice).toString());
    }
    /*9*/
    public void primerElemento(){
        int indice = 0;
        System.out.println(listaEmpleados.get(0));
    }
    /*10*/
    public void ultimoElemento(){
        int tamanioLista = listaEmpleados.size();
        System.out.println(listaEmpleados.get(tamanioLista-1));
    }
    /*11*/
    public void borrarElemento(int indice){
        listaEmpleados.remove(indice);
    }
}

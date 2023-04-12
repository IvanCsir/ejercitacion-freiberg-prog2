import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGenerica<T extends Comparable<T>> {
    private ArrayList<T> listaEmpleados;

    public ListaGenerica() {
        listaEmpleados = new ArrayList<T>();
    }
    public void agregar(T elemento) {
        listaEmpleados.add(elemento);
    }

    public void obtenerLista(){
        for (int iterador=0; iterador < listaEmpleados.size();iterador++){
            System.out.println(listaEmpleados.toString());
        }
    }
    public int tamanio() {
        return listaEmpleados.size();
    }

    public void ordernar(){
        Collections.sort(listaEmpleados);
    }

    public void desordenar(){
        Collections.shuffle(listaEmpleados);
    }
    public T agregarElementoIndice(int indice, T empleado){
      listaEmpleados.add(indice, empleado);
      return (T) listaEmpleados;
    }
    public void devolverObjetoPosicion(int indice){
        System.out.println( listaEmpleados.get(indice).toString());
    }
    public void primerElemento(){
        int indice = 0;
        System.out.println(listaEmpleados.get(0));
    }
    public void ultimoElemento(){
        int tamanioLista = listaEmpleados.size();
        System.out.println(listaEmpleados.get(tamanioLista-1));
    }
    public void borrarElemento(int indice){
        listaEmpleados.remove(indice);
    }
    }

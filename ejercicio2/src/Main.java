import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<Empleado> listaEmpleados = new ListaGenerica<Empleado>();
        Empleado empleado1 = new Empleado("Ivan", "Freiberg",4556,50);
        Empleado empleado2 = new Empleado("Juan", "Bolado", 4500, 10);
        Empleado empleado3 = new Empleado("Mauro", "Maidana", 4550, 3);
        Empleado empleado4 = new Empleado("Juan", "Elordi",45562,9);
        listaEmpleados.agregar(empleado1);
        listaEmpleados.agregar(empleado2);
        listaEmpleados.agregar(empleado3);
        listaEmpleados.devolverObjetoPosicion(0);
        listaEmpleados.obtenerLista();
        listaEmpleados.primerElemento();
        listaEmpleados.ultimoElemento();
        listaEmpleados.borrarElemento(0);
        listaEmpleados.obtenerLista();
        listaEmpleados.desordenar();
        listaEmpleados.agregarElementoPrimerPosicion(empleado4);
        listaEmpleados.obtenerLista();
        listaEmpleados.tamanio();

        }
    }
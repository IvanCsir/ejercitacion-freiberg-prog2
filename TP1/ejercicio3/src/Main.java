import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaGenerica<Empleado> listaEmpleados = new ListaGenerica<Empleado>();
        Empleado empleado1 = new Empleado("Ivan", "Freiberg",4556,50);
        Empleado empleado2 = new Empleado("Juan", "Bolado", 4500, 10);
        Empleado empleado3 = new Empleado("Mauro", "Maidana", 4550, 3);
        Empleado empleado4 = new Empleado("Luciano", "Abecasis", 4557, 5);

        listaEmpleados.agregar(empleado1);
        listaEmpleados.agregar(empleado2);
        listaEmpleados.agregar(empleado3);
        listaEmpleados.agregarElementoIndice(4,empleado4);


    }
}
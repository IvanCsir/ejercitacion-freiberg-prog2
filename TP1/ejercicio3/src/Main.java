import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaGenerica<Empleado> listaEmpleados = new ListaGenerica<Empleado>();
        Empleado empleado1 = new Empleado("Ivan", "Freiberg",4556,8);
        Empleado empleado2 = new Empleado("Juan", "Bolado", 4500, 10);
        Empleado empleado3 = new Empleado("Mauro", "Maidana", 4550, 30);
        Empleado empleado4 = new Empleado("Luciano", "Abecasis", 4557, 5);


        listaEmpleados.agregar(empleado1);
        listaEmpleados.agregar(empleado2);
        listaEmpleados.agregar(empleado3);
        try{listaEmpleados.agregarElementoIndice(2,empleado4);}
        catch (MiExcepcion e){
             System.out.println(e.getMessage());
         }
        listaEmpleados.obtenerLista();

        try{
            listaEmpleados.devolverObjetoPosicion(6);
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }

        listaEmpleados.vaciarLista();
        try{
            listaEmpleados.primerElemento();
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }

        try{
            listaEmpleados.ultimoElemento();
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }

        try{
            listaEmpleados.borrarElemento(5);
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }

    }
}
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Empleado> setEmpleados = new HashSet<>();
        Empleado empleado1 = new EmpleadoSet("Alex", "Arce", 59662,12);
        Empleado empleado2 = new EmpleadoSet("Mauro", "Maidana", 56220,5);
        Empleado empleado3 = new EmpleadoSet("Maximiliano", "Gagliardo", 10055,20);
        Empleado empleado4 = new EmpleadoSet("Alex", "Arce", 59662,12);
        Empleado empleado5 = new EmpleadoSet("Matías", "Reali", 15000,1);

        setEmpleados.add(empleado1);
        setEmpleados.add(empleado2);
        setEmpleados.add(empleado3);
        setEmpleados.add(empleado4);
        setEmpleados.add(empleado5);

        for (Empleado empleado : setEmpleados) {
            System.out.println("Empleado " +"\n" + empleado.toString()+ "\n");


        }

    }
}
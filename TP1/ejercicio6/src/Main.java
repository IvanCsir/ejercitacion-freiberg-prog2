import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Empleado> mapaEmpleados = new HashMap<>();
        Empleado empleado1 = new Empleado("Ivan", "Freiberg",4556,8);
        Empleado empleado2 = new Empleado("Juan", "Bolado", 4500, 10);
        Empleado empleado3 = new Empleado("Mauro", "Maidana", 4550, 30);
        Empleado empleado4 = new Empleado("Luciano", "Abecasis", 4557, 5);
        Empleado empleado5 = new Empleado("Francisco", "Petrasso", 4822, 1);

        mapaEmpleados.put(empleado1.getNombre() + empleado1.getApellido(), empleado1);
        mapaEmpleados.put(empleado2.getNombre() + empleado2.getApellido(), empleado2);
        mapaEmpleados.put(empleado3.getNombre() + empleado3.getApellido(), empleado3);
        mapaEmpleados.put(empleado4.getNombre() + empleado4.getApellido(), empleado4);
        mapaEmpleados.put(empleado5.getNombre() + empleado5.getApellido(), empleado5);

        for(Map.Entry<String, Empleado> entrada : mapaEmpleados.entrySet()) {
            String clave = entrada.getKey();
            Empleado empleado = entrada.getValue();
            System.out.println(clave + "\n"+ empleado + "\n");
        }






    }
}
import java.util.Objects;

public class EmpleadoSet extends Empleado{
    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoSet empleadoset = (EmpleadoSet) o;
        return legajo == empleadoset.legajo && Objects.equals(nombre, empleadoset.nombre) && Objects.equals(apellido, empleadoset.apellido) && aniosTrabajados == empleadoset.aniosTrabajados;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, legajo, aniosTrabajados);
    }

}

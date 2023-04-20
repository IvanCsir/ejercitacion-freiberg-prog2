public class Empleado {
    String nombre;
    String apellido;
    String  legajo;
    Integer aniosTrabajados;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

        public static Empleado metodoEstatico(String datosEmpleado) throws EmpleadoException {
            String[] datos = datosEmpleado.replaceAll(" ", "").toLowerCase().split(",");
            String nombre = null;
            String apellido = null;
            String legajo = null;
            Integer aniosTrabajados = 0;
            for (String dato : datos) {
                String[] campoValor = dato.split("=");
                String campo = campoValor[0];
                String valor = campoValor[1];
                switch (campo) {
                    case "nombre":
                        nombre = valor;
                        break;
                    case "apellido":
                        apellido = valor;
                        break;
                    case "legajo":
                        legajo = valor;
                        break;
                    case "aniostrabajados":
                        if (aniosTrabajados instanceof Integer) {
                            aniosTrabajados = Integer.parseInt(valor);}
                        else {
                            throw new EmpleadoException("El campo 'aniosTrabajados' debe ser un número entero");}

                        if (aniosTrabajados <= 0) {
                            throw new EmpleadoException("El campo 'aniosTrabajados' debe ser mayor a cero");
                        }
                        break;
                    default:
                        throw new EmpleadoException("El campo '" + campo + "' no es válido");
                }
            }
            if (nombre == null || apellido == null || legajo == null || aniosTrabajados == 0) {
                throw new EmpleadoException("El campo no puede estar vacio");
            }
            return new Empleado(nombre, apellido, legajo, aniosTrabajados);
        }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido +  "\n" + "Legajo: " + this.legajo + "\n" + "Años trabajados: " + this.aniosTrabajados;

    }
    }


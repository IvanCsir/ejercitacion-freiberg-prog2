public class Main {
    public static void main(String[] args) throws EmpleadoException{
        /*try {
            Empleado empleado1 = Empleado.metodoEstatico("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10");
            Empleado empleado2 = Empleado.metodoEstatico("nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=10");
            Empleado empleado3 = Empleado.metodoEstatico("nombre=Pablo ,apellido=Marquez ,legajo=E001, aniosTrabajados=10");
            Empleado empleado4 = Empleado.metodoEstatico("Nombre=Pablo,apellidO=Marquez ,LEGAJO=E001, ANIOStrabajados=10");
            Empleado empleado5 = Empleado.metodoEstatico("nombre=Pablo,legajo=E001,aniosTrabajados=10,apellido=Marquez");
            System.out.println(empleado1);
            *//*System.out.println(empleado2);
            System.out.println(empleado3);
            System.out.println(empleado4);
            System.out.println(empleado5);*//*
        } catch (EmpleadoException e) {
            System.out.println("Error al crear objeto Empleado: " + e.getMessage());
    }*/
        /*try{*/
        Empleado empleado1 = Empleado.metodoEstatico("nOMbre=Pablo, apellIdo=Marquez, LEGAJO=E001, aniosTrabajados=4");
        System.out.println(empleado1);
        Empleado empleado5 = Empleado.metodoEstatico("nombre=Pablo,legajo=E001,aniosTrabajados=10,apellido=MARQUEZ");
        System.out.println(empleado5);
        Empleado empleado2 = Empleado.metodoEstatico("nOMbre=Pablo, apellIdo=Marquez, LEGAJO=E001, aniosTrabajados=-7");
        System.out.println(empleado2);



}}
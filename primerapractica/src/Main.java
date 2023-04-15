import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Victorio");
        nameList.add("Luciano");
        nameList.add("Matias");
        nameList.add("Mauro");
        nameList.add("Alex");

        List<String> surnameList = new ArrayList<>();
        surnameList.add("Ramis");
        surnameList.add("Abecasis");
        surnameList.add("Reali");
        surnameList.add("Maidana");
        surnameList.add("Arce");

        List<Persona> peopleList = new ArrayList<>();
        Persona persona1 = new Persona(nameList.get(0), surnameList.get(0), (int)Math.floor(Math.random()*20+30));;
        Persona persona2 = new Persona(nameList.get(1), surnameList.get(1), (int)Math.floor(Math.random()*20+30));
        Persona persona3 = new Persona(nameList.get(2), surnameList.get(2), (int)Math.floor(Math.random()*20+30));
        Persona persona4 = new Persona(nameList.get(3), surnameList.get(3), (int)Math.floor(Math.random()*20+30));
        Persona persona5 = new Persona(nameList.get(4), surnameList.get(4), (int)Math.floor(Math.random()*20+30));

        peopleList.add(persona1);
        peopleList.add(persona2);
        peopleList.add(persona3);
        peopleList.add(persona4);
        peopleList.add(persona5);

        for (Persona persona : peopleList){
            System.out.println(persona.toString());
        }

        List ageList = new ArrayList();

        for (Persona persona : peopleList) {
            ageList.add(persona.getAge());
        }

        int maxAge = (int) Collections.max(ageList);
        for (Persona persona : peopleList){
            int edad = persona.getAge();

            if (edad == maxAge){
                System.out.println("El mayor es: \n");
            System.out.println(persona.toString());
        }


    }
}}
package software.ulpgc.kata1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adrián", LocalDate.of(2002, 8, 1));
        System.out.println("Nombre: " + person.getPerson() + " Cumpleaños: " + person.getBirthday() +
                            " Edad: " + person.getYears());
    }
}

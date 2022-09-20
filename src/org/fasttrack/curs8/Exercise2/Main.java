package org.fasttrack.curs8.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        Employee angajat1 = new Employee("Ion", "Ionescu", LocalDate.of(1969, 2, 24),
                "Bucuresti", LocalDate.of(2000, 10, 24), "inginer sistem");

        //formatez data
        DateTimeFormatter dataFormatata = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        //verific cum apare data dupa formatare
        String dataNastere = dataFormatata.format(LocalDate.of(1969, 2, 24));
        System.out.println("Data nasterii dupa formatare " + dataNastere);

        System.out.println(String.format("Angajatul %s %s nascut la data %s din %s, este angajat din %s in functia de %s",
                angajat1.getLastName(), angajat1.getFirstName(), dataFormatata.format(LocalDate.of(1969, 2, 24))
                , angajat1.getAddress(), dataFormatata.format(LocalDate.of(2000, 10, 24)),
                angajat1.getPosition()));

        Programmer programator = new Programmer("Ioana", "Popescu", LocalDate.of(1997, 8, 4),
                "Prahova", LocalDate.of(2019, 4, 6), "asistent soft", "Java");

        System.out.println(String.format("Angajatul %s %s nascut la data %s din %s, este angajat din %s in functia de %s - %s",
                programator.getLastName(), programator.getFirstName(), dataFormatata.format(LocalDate.of(1997, 8, 4)),
                programator.getAddress(), dataFormatata.format(LocalDate.of(2019, 4, 6)), programator.getPosition(),
                programator.getLanguage()));

        DatabaseAdmin adminBd = new DatabaseAdmin("Andreea", "Vasilescu", LocalDate.of(1992, 3, 6), "Sibiu",
                LocalDate.of(2020, 2, 1), " inginer sistem", "database relationate");

        System.out.println(String.format("Angajatul %s %s nascut la data %s din %s, este angajat din %s in functia de %s, lucreaza cu tehnologia  %s",
                adminBd.getLastName(),adminBd.getFirstName(), dataFormatata.format(LocalDate.of(1992,3,4)), adminBd.getAddress(),
                dataFormatata.format(LocalDate.of(2020,2,1)), adminBd.getPosition(), adminBd.getDbTechnology()));

        //afisez vechime in munca
        System.out.println(angajat1.getLastName() + " " + angajat1.getFirstName() + " s-a angajat in " + dataFormatata.format(angajat1.getDateOfEmployment()));
        System.out.println(angajat1.getLastName() + " " + angajat1.getFirstName() + " are o vechime in munca de " + angajat1.vechime());

    }
}
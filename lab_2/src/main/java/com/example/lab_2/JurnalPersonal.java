package com.example.lab_2;
import java.time.LocalDate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JurnalPersonal {
    public static void main(String[] args) {

        IntraJurnal intrare1 = new IntraJurnal(LocalDate.now(), "Ziua 1", "Am avut o zi productiva.", "Bucuros", 8);
        IntraJurnal intrare2 = new IntraJurnal(LocalDate.of(2024, 10, 27), "Ziua 2", "M-am simtit putin obosit azi.", "Neutru", 5);
        IntraJurnal intrare3 = new IntraJurnal();
        intrare3.setTitlu("Ziua 3");
        intrare3.setContinut("Am lucrat la proiectul nou.");
        intrare3.setStareEmotionala("Entuziasmat");
        intrare3.setNivelEnergie(7);

        System.out.println(intrare1);
        System.out.println(intrare2);
        System.out.println(intrare3);

        Utilizator user1 = new Utilizator("JavaJavist", "password123", "java.javist@gmail.com", LocalDate.of(1990, 5, 15));
        System.out.println(user1);

        Utilizator user2 = new Utilizator();
        user2.setNumeUtilizator("JavaJavist");
        user2.setParola("paswrrods");
        user2.setEmail("temp@mail.com");
        user2.setDataNasterii(LocalDate.of(1995, 11, 2));
        System.out.println(user2);


    }

}



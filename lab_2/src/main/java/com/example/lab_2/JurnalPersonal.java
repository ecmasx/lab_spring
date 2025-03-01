package com.example.lab_2;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import static java.time.LocalDate.now;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class JurnalPersonal {

    @Bean
    public Utilizator utilizatorBean() {
        return new Utilizator("JavaJavist", "password123", "java.javist@gmail.com", LocalDate.of(1990, 5, 15));
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JurnalPersonal.class, args);

        System.out.println("\n");

        Utilizator user1 = context.getBean("utilizatorBean", Utilizator.class);
        System.out.println("Utilizator din Bean: " + user1);

        IntraJurnal intrare = context.getBean("intraJurnalXml", IntraJurnal.class);
        intrare.setTitlu("Ziua 1");
        intrare.setContinut("Am avut o zi productiva.");
        intrare.setStareEmotionala("Bucuros");
        intrare.setNivelEnergie(8);
        intrare.setData(now());

        System.out.println("Intrare jurnal: " + intrare);

        JurnalService jurnalService = new JurnalService();
        jurnalService.setUtilizator(user1);
        jurnalService.afisareJurnal(intrare);
    }
}
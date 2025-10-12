package org.example.ecom;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomApplication {

    public static void main(String[] args) {


        Dotenv dotenv = Dotenv.configure().load();

        dotenv.entries().forEach((entry) -> {System.setProperty(entry.getKey(), entry.getValue());});

        SpringApplication.run(EcomApplication.class, args);
    }

}

package org.example.printservice;

//import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintServiceApplication {

    public static void main(String[] args) {
//        Dotenv dotenv = Dotenv.load();
//
//        System.setProperty("POSTGRES_USER", dotenv.get("POSTGRES_USER"));
//        System.setProperty("POSTGRES_PASSWORD", dotenv.get("POSTGRES_PASSWORD"));

        SpringApplication.run(PrintServiceApplication.class, args);
    }

}

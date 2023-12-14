package org.jmresler.jpa;

import lombok.extern.slf4j.Slf4j;
import org.jmresler.jpa.model.mappers.AgenciesMapper;
import org.jmresler.jpa.services.AgenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = {
        "org.jmresler.jpa.model.mappers"
})
public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}

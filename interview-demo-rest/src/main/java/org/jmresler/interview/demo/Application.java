package org.jmresler.interview.demo;

import lombok.extern.slf4j.Slf4j;
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

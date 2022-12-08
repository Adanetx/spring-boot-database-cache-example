package com.javadeveloperzone;

import com.javadeveloperzone.dao.EmployeeDAO;
import com.javadeveloperzone.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Java Developer Zone on 19-07-2017.
 */

@SpringBootApplication
//@ComponentScan
@EnableCaching      // to enable spring cache
public class SpringBootConfig {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootConfig.class, args);    // run spring boot application          // it wil start application
    }
    @Bean
    public CommandLineRunner commandLineRunner(EmployeeDAO repository){
        return (args -> {
            repository.save(new Employee("Adane", "Admin"));
            repository.save(new Employee("Abebe", "secretory"));
            repository.save(new Employee("Kiflom", "human resource"));
        });
    }
}

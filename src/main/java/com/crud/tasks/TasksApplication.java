package com.crud.tasks;

import com.crud.tasks.service.DbService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class TasksApplication{

    public static void main(String[] args) {

        SpringApplication.run(TasksApplication.class, args);
    }

    //@Override
  //  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
     //   return application.sources(TasksApplication.class);
   // }
}

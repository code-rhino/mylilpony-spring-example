package com.codedifferently.app;

import com.codedifferently.app.pony.model.MyLittlePony;
import com.codedifferently.app.pony.repo.MyLittlePonyRepo;
import com.codedifferently.app.pony.service.MyLittlePonyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

    Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    MyLittlePonyService service;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        service.create("Tony","Brown");
    }
}

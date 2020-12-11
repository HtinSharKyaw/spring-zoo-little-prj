package com.example.zoospringdata;

import com.example.zoospringdata.service.ZooService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZooSpringDataApplication implements CommandLineRunner {

    private final ZooService zooService;

    public ZooSpringDataApplication(ZooService zooService) {
        this.zooService = zooService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ZooSpringDataApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        zooService.createDb();
    }
}

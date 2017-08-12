package com.parser.server;

import com.parser.server.model.entity.IdentityObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackageClasses = IdentityObject.class)
@EnableTransactionManagement
public class ParserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParserServerApplication.class, args);
    }
}
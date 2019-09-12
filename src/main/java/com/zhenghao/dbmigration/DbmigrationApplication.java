package com.zhenghao.dbmigration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.zhenghao.dbmigration.mapper.*.*")
@EnableScheduling
public class DbmigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbmigrationApplication.class, args);
    }

}

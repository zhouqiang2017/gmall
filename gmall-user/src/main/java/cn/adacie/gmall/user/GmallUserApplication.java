package cn.adacie.gmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author czq
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.adacie.gmall.user.dao")
public class GmallUserApplication {

    public static void main(String[] args) {

        SpringApplication.run(GmallUserApplication.class, args);
    }

}

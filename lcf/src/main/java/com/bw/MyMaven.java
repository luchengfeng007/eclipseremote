package com.bw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//1234
@SpringBootApplication
@MapperScan("com.bw.mapper")
public class MyMaven {

	public static void main(String[] args) {
		SpringApplication.run(MyMaven.class, args);
	}
}

package com.cg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动
 * @author Administrator
 *
 */
@SpringBootApplication
@MapperScan("com.cg.mapper") //扫描Mybatis的Mapper接口
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

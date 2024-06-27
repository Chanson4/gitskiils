package com.example.demo_1.config;

import com.example.demo_1.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.boot.jdbc.mapper")
public class MybatisConfig {

}
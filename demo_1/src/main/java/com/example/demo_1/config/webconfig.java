//package com.example.demo_1.config;
//
//import com.example.demo_1.interceptor.login;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import javax.security.auth.login.LoginContext;
//
//@Configuration
//public class webconfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new login()).addPathPatterns("/user/**");
//    }
//}

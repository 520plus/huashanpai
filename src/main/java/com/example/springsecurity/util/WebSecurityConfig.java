package com.example.springsecurity.util;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/index").permitAll()
                .antMatchers("/user/**").hasRole("USER")
                .and()
                .formLogin()
                .and()
                .csrf().disable() //关闭CSRF
                .formLogin().loginPage("/login")//login-page 自定义登录页url,默认为/login
                .loginProcessingUrl("/form")//login-processing-url 登录请求拦截的url,也就是form表单提交时指定的action
                .defaultSuccessUrl("/login") //成功登陆后跳转页面
                .failureUrl("/loginError").permitAll();


    }
}

package com.ashraf.assignment2.securityconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@Order
public class SecurityConfig extends WebSecurityConfigurerAdapter  {
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication().withUser("nomaniUser").password("{noop}pwd").roles("User").and().withUser("Admin").password("{noop}admin").roles("Admin");
		
	}
	protected void configure(HttpSecurity http) throws Exception
	{
		http.httpBasic().and().authorizeRequests().antMatchers("/userlogin").hasRole("User").
		antMatchers("/adminlogin").hasRole("Admin").and().csrf().disable().headers().frameOptions().disable();
	}
	

}

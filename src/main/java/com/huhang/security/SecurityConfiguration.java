package com.huhang.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by joanna on 7/9/17.
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
  @Autowired
  public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("huhang").password("123").roles("ADMIN");
    auth.inMemoryAuthentication().withUser("tom").password("123").roles("USER");
  }

  /**
   * Disable cdrf for non-browser clients
   *
   */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable();
  }
}

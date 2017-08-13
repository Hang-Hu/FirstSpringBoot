package com.huhang;

import com.huhang.controller.interceptors.GlobalInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by joanna on 7/9/17.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new GlobalInterceptor());
  }
}

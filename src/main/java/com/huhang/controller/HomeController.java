package com.huhang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joanna on 6/5/17.
 */
@RestController
public class HomeController {
  @RequestMapping("/aa")
  public String index(){
    return "My homepage.";
  }
}

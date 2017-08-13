package com.huhang.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by joanna on 6/5/17.
 */
@Entity
public class Employee {

  @Id
  @GeneratedValue
  private Long id;
  private String firstName;
  private String lastName;
  private String description;

  public Employee() {
  }

  public Employee(String firstName, String lastName, String description) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.description = description;
  }
}

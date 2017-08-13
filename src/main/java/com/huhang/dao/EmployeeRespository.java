package com.huhang.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by joanna on 6/5/17.
 */

public interface EmployeeRespository extends CrudRepository<Employee, Long> {
  Employee findByFirstName(@Param("name") String firstName);
  List<Employee> findByLastName(String lastName);
}

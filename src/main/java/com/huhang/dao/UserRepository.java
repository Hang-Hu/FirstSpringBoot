package com.huhang.dao;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by joanna on 6/6/17.
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
  List<User> findByLastName(@Param("name") String name);

}
package com.huhang.dao;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by joanna on 7/8/17.
 */
@Repository
public interface NoteRepository extends PagingAndSortingRepository<Note, Long> {
  List<Note> findByTitle(@Param("title") String title);
}

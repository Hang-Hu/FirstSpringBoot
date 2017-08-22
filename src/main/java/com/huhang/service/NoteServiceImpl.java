package com.huhang.service;

import com.huhang.dao.Note;
import com.huhang.dao.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


/**
 * Created by joanna on 7/21/17.
 */
@Service
@CacheConfig
public class NoteServiceImpl implements NoteService {
  private static final Logger LOGGER= LoggerFactory.getLogger(NoteServiceImpl.class);
  @Autowired
  private NoteRepository noteRepo;

  @Override
  //@Cacheable(cacheNames = "notes")
  @Cacheable(cacheNames = "notes")
  public Iterable<Note> getAllNotes() {
    LOGGER.info("Get all notes.");
    return noteRepo.findAll();
  }
}

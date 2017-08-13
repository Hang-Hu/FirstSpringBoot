package com.huhang.service;

import com.huhang.dao.Note;
import com.huhang.dao.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by joanna on 7/21/17.
 */
@Service
public class NoteServiceImpl implements NoteService {

  @Autowired
  private NoteRepository noteRepo;

  @Override
  public Iterable<Note> getAllNotes() {
    return noteRepo.findAll();
  }
}

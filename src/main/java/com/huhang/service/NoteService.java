package com.huhang.service;

import com.huhang.dao.Note;
import org.springframework.stereotype.Service;

/**
 * Created by joanna on 7/21/17.
 */
public interface NoteService {

  public Iterable<Note> getAllNotes();
}

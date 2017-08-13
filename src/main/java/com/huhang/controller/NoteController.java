package com.huhang.controller;

import com.huhang.dao.Note;
import com.huhang.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joanna on 7/21/17.
 */
@RestController
public class NoteController {

  @Autowired
  private NoteService noteService;

  @RequestMapping("/getAllNotes")
  public Iterable<Note> getAllNotes() {
    return noteService.getAllNotes();
  }
}

package com.huhang.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.huhang.dao.Note;
import com.huhang.dao.NoteRepository;
import com.huhang.service.NoteService;
import com.huhang.service.NoteServiceImpl;
import java.text.SimpleDateFormat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by joanna on 7/24/17.
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@Sql("/init.sql")
@SpringBootTest(classes = NoteServiceImpl.class)
@DataJpaTest
@ComponentScan(basePackages = "com.huhang.service")
public class TestNoteService {

  @Autowired
  private TestEntityManager testEntityManager;

  @Autowired
  private NoteRepository noteRepository;


  private NoteService noteService=new NoteServiceImpl();

  @Before
  public void setUp() throws Exception {
    noteService

  }

  @Test
  public void testGetAllNotes() {

    Iterable<Note> notes = noteService.getAllNotes();
    System.out.println("Notes: ");
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    for (Note note : notes) {
      System.out.println(note);
      assertThat(format.format(note.getCreationDate())).isEqualTo("2017-07-24 10:08:22");
      assertThat(format.format(note.getLastModified())).isEqualTo("2017-07-24 10:08:24");
      assertThat(note.getText()).isEqualTo("First note.");
      assertThat(note.getTitle()).isEqualTo("Note1");
      assertThat(note.getUser().getId()).isEqualTo((long) 1);

    }
  }

}

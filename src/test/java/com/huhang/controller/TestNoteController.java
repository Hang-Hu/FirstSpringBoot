package com.huhang.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.huhang.dao.Note;
import com.huhang.service.NoteService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by joanna on 7/21/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class TestNoteController {

  @LocalServerPort
  private int port;
  @Autowired
  private TestRestTemplate restTemplate;
  @MockBean
  private NoteService noteService;

  @Before
  public void setUp() {

  }

  @Test
  public void testGetAllNotes() throws Exception {
    String json = this.restTemplate
        .getForObject("http://localhost:" + port + "/", String.class);

    System.out.println(json);
    /*this.mockMvc.perform(get("/getAllNotes")).andDo(print()).andExpect(status().isOk())
        .andExpect(jsonPath("$[0].title", is("Test")));*/
  }


}

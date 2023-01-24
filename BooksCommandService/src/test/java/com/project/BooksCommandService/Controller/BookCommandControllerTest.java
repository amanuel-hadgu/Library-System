package com.project.BooksCommandService.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.BooksCommandService.Service.Dto.BookDto;
import com.project.BooksCommandService.Service.IBookCommandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {BookCommandController.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class BookCommandControllerTest {
    @Autowired
    private BookCommandController bookCommandController;

    @MockBean
    private IBookCommandService iBookCommandService;

    /**
     * Method under test: {@link BookCommandController#addBook(BookDto)}
     */
    @Test
    public void testAddBook() throws Exception {
        when(iBookCommandService.addBook((BookDto) any()))
                .thenReturn(new BookDto(1L, "Dr", "The characteristics of someone or something", "JaneDoe"));

        BookDto bookDto = new BookDto();
        bookDto.setAuthor("JaneDoe");
        bookDto.setDescription("The characteristics of someone or something");
        bookDto.setIsbn(1L);
        bookDto.setTitle("Dr");
        String content = (new ObjectMapper()).writeValueAsString(bookDto);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/books/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(bookCommandController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"isbn\":1,\"title\":\"Dr\",\"description\":\"The characteristics of someone or something\",\"author\":"
                                        + "\"JaneDoe\"}"));
    }

    /**
     * Method under test: {@link BookCommandController#updateBook(long, BookDto)}
     */
    @Test
    public void testUpdateBook() throws Exception {
        when(iBookCommandService.updateBook(anyLong(), (BookDto) any()))
                .thenReturn(new BookDto(1L, "Dr", "The characteristics of someone or something", "JaneDoe"));

        BookDto bookDto = new BookDto();
        bookDto.setAuthor("JaneDoe");
        bookDto.setDescription("The characteristics of someone or something");
        bookDto.setIsbn(1L);
        bookDto.setTitle("Dr");
        String content = (new ObjectMapper()).writeValueAsString(bookDto);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/books/update/{isbn}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(bookCommandController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"isbn\":1,\"title\":\"Dr\",\"description\":\"The characteristics of someone or something\",\"author\":"
                                        + "\"JaneDoe\"}"));
    }

    /**
     * Method under test: {@link BookCommandController#deleteBook(long)}
     */
    @Test
    public void testDeleteBook() throws Exception {
        when(iBookCommandService.deleteBook(anyLong()))
                .thenReturn(new BookDto(1L, "Dr", "The characteristics of someone or something", "JaneDoe"));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/books/delete/{isbn}", 1L);
        MockMvcBuilders.standaloneSetup(bookCommandController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"isbn\":1,\"title\":\"Dr\",\"description\":\"The characteristics of someone or something\",\"author\":"
                                        + "\"JaneDoe\"}"));
    }
}


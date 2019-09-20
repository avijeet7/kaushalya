package com.kaushalyaprakashan.kp.controller;

import com.kaushalyaprakashan.kp.model.Book;
import com.kaushalyaprakashan.kp.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class Inventory {

    @Autowired
    private
    BookRepo bookRepo;

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @GetMapping("/book")
    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable long id) {
        bookRepo.deleteById(id);
    }

}
package com.kaushalyaprakashan.kp.repository;

import com.kaushalyaprakashan.kp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}

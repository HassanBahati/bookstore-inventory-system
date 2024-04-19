package com.booksystem.booksystem.repository;

import com.booksystem.booksystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT book FROM Book book WHERE " + "LOWER(book.title) LIKE LOWER(CONCAT('%', :title, '%'))")
    List<Book> findByTitle(@Param("title") String title);

    List<Book> findByIdIn(List<Long> bookIds);
}
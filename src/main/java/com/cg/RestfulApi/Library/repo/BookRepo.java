package com.cg.RestfulApi.Library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.RestfulApi.Library.Models.Book;

public interface BookRepo extends JpaRepository<Book, Long>{

}

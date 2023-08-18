package com.nt.niranjana.springboot.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.niranjana.springboot.datajpa.entity.Book;

public interface BookRepositoryWithDefaultFinderMethod  extends JpaRepository<Book, Integer>
{

}

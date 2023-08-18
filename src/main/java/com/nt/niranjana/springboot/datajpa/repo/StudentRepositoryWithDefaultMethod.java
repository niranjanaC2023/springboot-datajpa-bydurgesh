package com.nt.niranjana.springboot.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.niranjana.springboot.datajpa.entity.Students;

public interface StudentRepositoryWithDefaultMethod  extends JpaRepository<Students, Integer>
{

}

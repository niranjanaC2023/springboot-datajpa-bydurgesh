package com.nt.niranjana.springboot.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.niranjana.springboot.datajpa.entity.Students;
import com.nt.niranjana.springboot.datajpa.exception.CustomInsertException;
import com.nt.niranjana.springboot.datajpa.repo.StudentRepositoryWithUserDefinedMethod;

@Service
public class StudentServiceWithUserDefinedMethod 
{

	@Autowired
	private StudentRepositoryWithUserDefinedMethod studentRepo;
	
	//get all book details from DB
	public List<Students> getAllStudentsClassDetailsFromDB() 
	{
		System.out.println("This is Service getAllStudentsClassDetailsFromDB");
		try
		{
			List<Students> getAllStudentsDetails = studentRepo.fetchAllStudents();
			System.out.println("After findAll");
			return getAllStudentsDetails;
		}
		catch(CustomInsertException cie)
		{
			throw new CustomInsertException("Ploblem to Insert Multiple data Into Database");
		}
	}

	//get Single Students details From DB by using its ID
	  public Students getStudentsClassDetailsFromDBByUsingItsID(int id)
	  {
		  System.out.println("This is Service getStudentsClassDetailsFromDBByUsingItsID");
		  Students getSingleStudentsDetails = studentRepo.fetchStudentsAllDetailsById(id);
		  System.out.println("getSingleStudentsDetails: "+getSingleStudentsDetails);
		return getSingleStudentsDetails;
	  }
	  
	}



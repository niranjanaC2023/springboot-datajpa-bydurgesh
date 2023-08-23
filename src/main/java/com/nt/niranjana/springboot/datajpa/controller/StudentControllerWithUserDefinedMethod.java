//package com.nt.niranjana.springboot.datajpa.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.nt.niranjana.springboot.datajpa.entity.Students;
//import com.nt.niranjana.springboot.datajpa.service.StudentServiceWithDefaultFinderMethod;
//
//@RestController
//@RequestMapping("/studentDetails")
//public class StudentControllerWithUserDefinedMethod
//{
//	@Autowired
//	private StudentServiceWithDefaultFinderMethod studentService;
//	 
//	
//	//fetch all book details from DB
//	@GetMapping("/fetchAllStudentsDetails")
//	public ResponseEntity<List<Students>> fetchAllStudentsDetails()
//	{
//		System.out.println("This is Controller fetchAllStudentsDetails method");
//		List<Students> fetchedAllStudentsData = studentService.getAllStudentsClassDetailsFromDB();
//		System.out.println("fetchedAllStudentsData: "+fetchedAllStudentsData);
//		if(fetchedAllStudentsData.size()<=0)
//		{
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//		else
//		{
//			return ResponseEntity.of(Optional.of(fetchedAllStudentsData));
//		}
//	}
//		
//	//fetch students details from DB using ID
//	@GetMapping("/fetchSingleStudentsDetails/{id}")
//	public ResponseEntity<Students> fetchSingleStudentDetails(@PathVariable("id") int id)
//	{
//		System.out.println("This is Controller fetchSingleStudentDetails method");
//		
//		Students fetchedSingleStudentData = studentService.getStudentsClassDetailsFromDBByUsingItsID(id);
//		System.out.println("fetchedSingleStudentData: "+fetchedSingleStudentData);
//		if(fetchedSingleStudentData == null)
//		{
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//		else
//		{
//			return ResponseEntity.of(Optional.of(fetchedSingleStudentData));
//		}	
//	}
//	//insert one Student details
//	@PostMapping("/insertedSingleStudentsDetails")
//	public ResponseEntity<Students> insertSingleStudentsDetails(@RequestBody Students studentDetails)
//	{
//		System.out.println("This is Controller insertSingleStudentsDetails method");
//		try
//		{
//			Students insertedSingleStudents = studentService.insertStudentsClassDetailsIntoDB(studentDetails);
//			System.out.println("insertedSingleStudents: "+insertedSingleStudents);
//			return ResponseEntity.of(Optional.of(insertedSingleStudents));
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//			
//		}
//		
//	}
//	
//	//insert Multiple Students details
//	@PostMapping("/insertedMultipleStudentsDetails")
//	public ResponseEntity<List<Students>> insertMultipleStudentsDetails(@RequestBody List<Students> studentDetails)
//	{
//		System.out.println("This is Controller insertMultipleStudentsDetails method");
//		try
//		{
//			List<Students> insertedMultipleStudent = studentService.insertMultipleStudentsClassDetailsIntoDB(studentDetails);
//			System.out.println("insertedMultipleStudent: "+insertedMultipleStudent);
//			return ResponseEntity.of(Optional.of(insertedMultipleStudent));
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//			
//		}
//	}
//	
//	//delete single student details from DB using its ID
//	@DeleteMapping("/deleteSingleStudentDetails/{id}")
//	public ResponseEntity<Void> deleteSingleStudentDetails(@PathVariable("id") int id)
//	{
//		System.out.println("This is Controller deleteSingleStudentDetails method");
//		try
//		{
//			studentService.deleteSingleStudentsData(id);
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//	}
//	
//	//update students details into DB
//	@PutMapping("/updateStudentsDetails/{id}")
//	public ResponseEntity<Students> updateStudentsDetails(@RequestBody Students student ,@PathVariable("id") int id)
//	{
//		System.out.println("This is Controller updateStudentsDetails method");
//		try
//		{
//			Students fetchedStudentDataIDDetails = studentService.getStudentsClassDetailsFromDBByUsingItsID(id);
//			System.out.println("fetchedStudentDataIDDetails"+fetchedStudentDataIDDetails);
//			System.out.println(student+""+student.getSno());
//			if(student.getSno().equals(fetchedStudentDataIDDetails.getSno()))
//			{
//				fetchedStudentDataIDDetails.setSname(student.getSname());
//				fetchedStudentDataIDDetails.setSaddrs(student.getSaddrs());
//				fetchedStudentDataIDDetails.setSsal(student.getSsal());
//			}
//			Students updatedStudentsDetails = studentService.insertStudentsClassDetailsIntoDB(student);
//			System.out.println("updatedStudentsDetails"+updatedStudentsDetails);
//			return ResponseEntity.ok().body(updatedStudentsDetails);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//	}
//
//}

package com.nt.niranjana.springboot.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nt.niranjana.springboot.datajpa.fileupload.FileUploadHelperIntoStaticDirectory;

@RestController
public class OnlyImageFileUploadIntoaStaticFolderController 
{
	@Autowired
	private FileUploadHelperIntoStaticDirectory fileHelper;
	
	@PostMapping("/uploadFileStatic")
	public ResponseEntity<String> fileUpload(@RequestParam("file")MultipartFile file)
	{
		System.out.println("Get File Name: "+file.getOriginalFilename());
		System.out.println("Get File Parameter Name: "+file.getName());
		System.out.println("Get File Size: "+file.getSize());
		System.out.println("Get File Name: "+file.getContentType());
		
		try
		{
			//validation
			if(file.isEmpty())
			{
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Given File Is Empty");
			}
			if(!file.getContentType().equals("image/jpeg"))
			{
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPG format allow");
			}
			
			////file uplod
			boolean isUploadFile = fileHelper.uploadFile(file);
			if(isUploadFile)
			{
				return ResponseEntity.ok("File Data uploaded successfully");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Some Where wrong!Try Again");
	}

}

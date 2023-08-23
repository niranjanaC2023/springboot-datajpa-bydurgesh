package com.nt.niranjana.springboot.datajpa.fileupload;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelperIntoStaticDirectory 
{
	public final String UPLOAD_DIR = "C:\\sts\\Niranjana\\springboot-datajpa-bydurgesh\\src\\main\\resources\\static\\images";

	public boolean uploadFile(MultipartFile multipartFile)
	{
		boolean f = false;
		
		try 
		{
			/*
			//1st way:
			//read the file
			InputStream content = multipartFile.getInputStream();
			byte data[] = new byte[content.available()];
			content.read(data);
			
			//write the file
			//FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+"\\"+multipartFile.getOriginalFilename());
			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			f=true;
			*/
			
			//2nd way: using Files.copy()
			Files.copy(multipartFile.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
}

package com.demo.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) 
	{
		CreateFile c=new CreateFile();
		c.CreateNewFile("PANKAJ");
	}

	public void CreateNewFile(String filename ) 
	{
		String filePath = System.getProperty("user.dir");
		System.out.println(filePath);
		File file=new File(filePath +"\\" + filename);

		try{
			if(!file.exists()){
				file.createNewFile();
				System.out.println("Fileis created");
			}
			else{
				System.out.println("file already exist");
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}

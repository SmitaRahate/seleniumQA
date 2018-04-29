package com.demo.io;

import java.io.File;

public class CreateDirectory {
	public static void main(String[] args) {
		CreateADirectory("smita123");
	}
	public static void CreateADirectory(String DirectoryName) {
		String workingDirectory=System.getProperty("user.dir");
		String dir="D:" + File.separator+DirectoryName;
		System.out.println("Final file directory:"+dir);

		File file=new File(dir);

		if (!file.exists())
		{
			file.mkdir();
			System.out.println("Directory is created");
		}
		else{
			System.out.println("already exits");
		}
	}
}

package com.cms.readFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadTestByNIO {

	public static void main(String[] args) {
		String filePath = "src/resources/bigFile.txt";
		File file = new File(filePath);
		System.out.println(file.length());
		try {
			long start = System.currentTimeMillis();
			Files.lines(Paths.get(filePath)).filter(str -> str.contains("chandra")).forEach(System.out :: println);
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

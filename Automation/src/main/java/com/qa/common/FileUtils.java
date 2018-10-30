package com.qa.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {
	
	public static void isFileExist(File file) throws FileNotFoundException {
		if(!file.exists())
			throw new FileNotFoundException("File not found in "+file.getAbsolutePath());
	}
		
	
	public static Properties readProperties(String filePath) throws IOException {
		File file = new File(filePath + ".properties");
		isFileExist(file);
		Properties properties = new Properties();
		InputStream in = new FileInputStream(file);
		properties.load(in);
		in.close();
		return properties;
		
	}

}

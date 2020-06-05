package day4;


import java.io.IOException;

import org.apache.log4j.*;

public class AppConFile {
	
	static Logger logger = Logger.getLogger("AppConFile.class");
	
	public static void main(String[] args) throws IOException {
		
		FileAppender fileappender =new FileAppender(new PatternLayout(), "mylog1.txt");
		
		logger.addAppender(fileappender);
		logger.debug("This is debug message");
		logger.info("this is info message");
		logger.error("this is error message");
		
		System.out.println("Success");

				
	}

}

package day4;

import java.io.IOException;

import org.apache.log4j.*;

public class AppDemo {
	static Logger logger = Logger.getLogger("AppDemo.class");

	public static void main(String[] args) throws IOException {
		FileAppender fileappender =new FileAppender(new PatternLayout(), "mylog.txt");
		//FileAppender fileappender1 =new FileAppender(new HTMLLayout(), "myweb.html");
		logger.addAppender(fileappender);
		logger.debug("This is debug message");
		logger.info("this is info");
		logger.error("this is error");
		
		System.out.println("Success");
		

		}

	}



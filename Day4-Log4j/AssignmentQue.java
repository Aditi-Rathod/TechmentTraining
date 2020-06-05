package day4;

import java.io.IOException;

import org.apache.log4j.*;

public class AssignmentQue {

	static Logger log= Logger.getLogger(AssignmentQue.class);

	public static void main(String[] args) throws IOException{
		FileAppender fileappender =new FileAppender(new PatternLayout(), "log2.txt");
		log.addAppender(fileappender);
		log.debug("This is debug message");
		log.info("This is info message");
		log.warn("This is warn message");
		log.error("This is error message");
		log.fatal("This is fatal message");

	}

}

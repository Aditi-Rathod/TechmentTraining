package day4;

import java.io.IOException;

import org.apache.log4j.Logger;

public class LogDemo {
	static Logger log= Logger.getLogger(LogDemo.class);

	public static void main(String[] args) throws IOException {
		log.debug("This is debug message");
		log.info("this is info");
		log.warn("This is warn");
		log.error("this is error");
		log.fatal("This is fatal");
	}

}

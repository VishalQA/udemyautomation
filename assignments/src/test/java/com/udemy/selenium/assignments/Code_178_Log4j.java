package com.udemy.selenium.assignments;

import org.apache.logging.log4j.*;
public class Code_178_Log4j {

	private static Logger log = LogManager.getLogger(Code_178_Log4j .class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debuggibng");
		log.info("Object is present");
		log.error("Object is not present");
		log.fatal("This is fatal");
		
	}

}

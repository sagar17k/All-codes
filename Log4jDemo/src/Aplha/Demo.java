package Aplha;

import org.apache.logging.log4j.*;


public class Demo {
	
	private static Logger log = LogManager.getLogger(Demo.class);
	public static void main(String...args) {
		
		log.error("error");
		log.info("info");
		log.fatal("fatal");
		log.debug("trace");
		
		
	}

}

package Beta;


import org.apache.logging.log4j.*;



public class Demo2 {
	
	private static Logger log = LogManager.getLogger(Demo2.class.getName());
	public static void main(String...args) {
		
		log.error("error");
		log.info("info");
		log.fatal("fatal");
		log.debug("trace");
		
		
	}

}

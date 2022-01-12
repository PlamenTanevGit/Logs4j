package utilities;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {
	
	
	public static Logger log = Logger.getLogger(Test.class.getName());

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d.toString().replace(":", "_").replace(" ", "_"));
		System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		
		log.info("This is the INFO log");
		
		log.error("This is ERROR log");
		
		log.debug("This is DEBUG log ");

	}

}

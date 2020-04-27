package log4j;

import org.apache.log4j.Logger;

public class Demo {
	private static final Logger logger = Logger.getLogger(Demo.class);

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			logger.debug("bedug log");
			logger.error("error log");
			logger.info("info log");
		}
	}

}

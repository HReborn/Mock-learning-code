package com.logging.logback;

import org.slf4j.Logger;

public class Main {
	public static void main(String[] args) {
		Logger logger = Log.getLogger();
		logger.info("First log message from {}", Main.class.getSimpleName());
	}
}

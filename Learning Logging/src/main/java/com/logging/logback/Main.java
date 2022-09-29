package com.logging.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Main.class);
		logger.info("First log message from {}", Main.class.getSimpleName());
	}
}

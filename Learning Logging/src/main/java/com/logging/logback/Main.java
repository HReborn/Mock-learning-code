package com.logging.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;

public class Main {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Main.class);
		Logger rootLogger = LoggerFactory.getLogger(Tests.class);
		rootLogger.atTrace();
		rootLogger.trace("crappity");
		Logger root = (Logger)LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
		root.setLevel();
		
		try {
			logger.info("First log message from {}", Main.class.getSimpleName());
			@SuppressWarnings("unused")
			int crap = 42/0;
		} catch (ArithmeticException e) {
			logger.trace("crazy", e);
		}
	}
}
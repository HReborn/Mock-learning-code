package com.learning.angular_server.anyobj;

public class AnyObjNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AnyObjNotFoundException(Long id) {
		super("Could not find AnyObj with id of " + id);
	}

	
	
}

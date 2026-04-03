package com.tenzies;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tenzies.model.TenziesUser;

@Path("tenzies")
public class TenziesUserResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public TenziesUser getUser() {
		return null;
	}
}
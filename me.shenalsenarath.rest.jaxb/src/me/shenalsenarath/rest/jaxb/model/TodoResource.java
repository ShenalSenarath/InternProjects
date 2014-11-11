package me.shenalsenarath.rest.jaxb.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todo")
public class TodoResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Todo getXML() {
		Todo todo = new Todo();
		todo.setSummary("This is Application XML first todo");
		todo.setDescription("This is Application XML first todo");
		return todo;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Todo getJson() {
		Todo todo = new Todo();
		todo.setSummary("This is Application json first todo");
		todo.setDescription("This is Application json first todo");
		return todo;
	}


	// This can be used to test the integration with the browser
	@GET
	@Produces( MediaType.TEXT_XML )
	public Todo getHTML() {
		Todo todo = new Todo();
		todo.setSummary("This is Text XML first todo");
		todo.setDescription("This is Text XML first todo");
		return todo;
		
	}
}

package me.shenalsenarath.rest.first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello(){
		return "Plaing Hello :D ";
		
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		return  "<?xml version=\"1.0\"?>" + "<hello> xml Hello " + "</hello>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		return "<html> " + "<title>" + "html Hello " + "</title>"
		        + "<body><h1>" + "html Hello " + "</body></h1>" + "</html> ";
	}
}

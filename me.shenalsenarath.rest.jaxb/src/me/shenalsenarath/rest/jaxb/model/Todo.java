package me.shenalsenarath.rest.jaxb.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo {
	private String Summary;
	private String description;
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String Summary) {
		this.Summary = Summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

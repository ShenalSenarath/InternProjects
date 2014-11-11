package me.shenalsenarath.rest.todo.dao;

import java.util.HashMap;
import java.util.Map;

import me.shenalsenarath.rest.todo.model.Todo;

public enum TodoDao {
	instance;

	private Map<String, Todo> contentProvider = new HashMap<String, Todo>();

	private TodoDao() {
		Todo todo = new Todo("1", "Learn Rest");
		todo.setDescription("Read the online turorial");
		
		contentProvider.put("1", todo);

		Todo todo1 = new Todo("2", "Be the best");
		todo1.setDescription("Master Rest");

		contentProvider.put("2", todo1);

	}

	public Map<String, Todo> getModel() {
		return contentProvider;
	}
}

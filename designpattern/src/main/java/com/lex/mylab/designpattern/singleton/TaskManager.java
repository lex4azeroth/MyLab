package com.lex.mylab.designpattern.singleton;

public class TaskManager {
	
	private TaskManager() {
		
	}

	private static class TaskManagerHolder {
		private final static TaskManager INSTANCE = new TaskManager();
	}
	
	public static TaskManager getInstance() {
		return TaskManagerHolder.INSTANCE;
	}
	
	
}

package com.lex.mylab.designpattern.singleton;

public class TaskManagerContainer {
	
	public static void main(String[] args) {
		TaskManager tm = TaskManager.getInstance();
		TaskManager tm2 = TaskManager.getInstance();
		
		if (tm == tm2) {
			System.out.println("tm1 has the same reference as tm2, singleton~");
		}
		
		TaskManagerE tme = TaskManagerE.INSTANCE;
		TaskManagerE tme2 = TaskManagerE.INSTANCE;
		
		if (tme == tme2) {
			System.out.println("tme has the same reference as tme2, singleton~");
		}
	}

}

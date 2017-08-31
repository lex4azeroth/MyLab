package com.lex.mylab.designpattern.prototype;

public class ReportPrototype implements Cloneable {
	
	private String name;
	private String reporter;
	private String description;
	private String type;
	
	public ReportPrototype clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
			return (ReportPrototype) obj;
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone not supported");
			return null;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

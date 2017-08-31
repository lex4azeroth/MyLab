package com.lex.mylab.designpattern.prototype;

import java.io.Serializable;

public class Attachment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2074732956695763407L;
	
	private String name;
	private String owner;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

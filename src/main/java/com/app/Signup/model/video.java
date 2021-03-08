package com.app.Signup.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class video {
	@Id
	
	private int id;
	private String name;
	private String desc;
	private int views;
	
	public video() {
		
	}
	public video(int id, String name, String desc, int views) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.views = views;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
}
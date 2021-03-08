package com.app.Signup.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Signup.model.video;


@RestController
public class crudcontroller {
	@Autowired
	private crudcontroller service;
	
	
	@GetMapping("/getvideolist")
	public List<video> fetchvideoList(){
List<video> videos= new ArrayList<video>();
		
	    videos=service.fetchvideoList();
		return videos;
		
	}
}

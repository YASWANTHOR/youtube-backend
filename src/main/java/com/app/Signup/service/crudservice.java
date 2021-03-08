package com.app.Signup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Signup.Repository.crudrepository;
import com.app.Signup.model.video;




@Service
public class crudservice {
	
	@Autowired
	private crudrepository repository;
	public List<video> fetchvideoList(){
		
		return repository.findAll();
		
		
	}

}

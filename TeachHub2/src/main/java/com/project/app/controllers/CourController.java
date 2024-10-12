package com.project.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.models.Cour;
import com.project.app.services.jwt.IcourService;





@RestController
public class CourController {
	@Autowired
	private IcourService  courserv;
	
	
	
	@PostMapping(value="/addcour")
	public Cour addUser(@RequestBody Cour cour ) {
		return courserv.addCour(cour);
	}
	
	@GetMapping(value = "/cours")
    public List<Cour> getAllCours() {
        return courserv.getAllCours(); 
    }
}

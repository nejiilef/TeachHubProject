package com.project.app.services.jwt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.models.Cour;
import com.project.app.repository.CourRepository;







@Service
public class CourService implements IcourService {
	@Autowired
	//c'est une instance de repository
	CourRepository courrep ;

	@Override
	public Cour addCour(Cour Cour) {
		 Cour savedCour = courrep.save(Cour);
		return savedCour;
	}

	@Override
	public List<Cour> getAllCours() {
		return courrep.findAll();
	}

}

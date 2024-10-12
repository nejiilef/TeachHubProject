package com.project.app.services.jwt;

import java.util.List;

import com.project.app.models.Cour;



public interface IcourService {
	public Cour addCour(Cour Cour);
	public List<Cour> getAllCours(); 
}

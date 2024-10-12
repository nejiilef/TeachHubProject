package com.project.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cour {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCours;

    private String nom;

    private float coefficient;

    private int credits;
    
    public Cour() {
        super();
    }

	public Integer getIdCours() {
		return idCours;
	}

	public void setIdCours(Integer idCours) {
		this.idCours = idCours;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

}

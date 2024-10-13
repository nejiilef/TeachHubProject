package com.project.app.models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cour {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCours;

    private String nom;

    private float coefficient;

    private int credits;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="enseignant_id")
    private Enseignant enseignant;
    
    public Cour() {
        super();
    }

	public Integer getIdCours() {
		return idCours;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
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

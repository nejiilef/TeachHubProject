package com.project.app.models;



import java.util.Date;

import javax.validation.constraints.Future;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;


@Entity
public class Devoir {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDevoir;

    private String typedevoir;  
    private String description;

    private float ponderation;

    private float bareme;
    
    @Future(message = "La date limite doit être dans le futur")
    private Date dateLimite;

    private String statut;
  
    @ManyToOne
    @JoinColumn(name = "id_cours", nullable = false)
    private Cour cours;
    @Lob
    private byte[] pdf;  // Champ pour stocker le fichier PDF

    // Getters et setters

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }

	public Long getIdDevoir() {
		return idDevoir;
	}

	public void setIdDevoir(Long idDevoir) {
		this.idDevoir = idDevoir;
	}

	
	public String getTypedevoir() {
		return typedevoir;
	}

	public void setTypedevoir(String typedevoir) {
		this.typedevoir=typedevoir;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPonderation() {
		return ponderation;
	}

	public void setPonderation(float ponderation) {
		this.ponderation = ponderation;
	}

	public float getBareme() {
		return bareme;
	}

	public void setBareme(float bareme) {
		this.bareme = bareme;
	}

	public Date getDateLimite() {
		return dateLimite;
	}

	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Cour getCours() {
		return cours;
	}

	public void setCours(Cour cours) {
		this.cours = cours;
	}

	


	

}

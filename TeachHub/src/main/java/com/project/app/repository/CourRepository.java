package com.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.app.models.Cour;



@Repository
public interface CourRepository extends JpaRepository <Cour,Integer>{

}

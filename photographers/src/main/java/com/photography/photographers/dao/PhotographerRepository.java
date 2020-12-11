package com.photography.photographers.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photography.photographers.model.Photographer;

public interface PhotographerRepository extends JpaRepository<Photographer, Long> {

}

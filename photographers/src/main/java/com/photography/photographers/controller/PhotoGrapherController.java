package com.photography.photographers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photography.photographers.model.Photographer;
import com.photography.photographers.service.PhotoGrapherService;

@RestController
@RequestMapping("/api")
public class PhotoGrapherController {

	@Autowired
	private PhotoGrapherService photographerService;

	@PostMapping(value = "/createProfile", consumes = { "application/json" }, produces = { "produces/json" })
	public ResponseEntity<Photographer> createPhotographerProfile(@Validated @RequestBody Photographer photographer) {
		try {
			Photographer savedPhotographerProfile = photographerService.savePhotographer(photographer);
			return new ResponseEntity<Photographer>(savedPhotographerProfile, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

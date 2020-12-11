package com.photography.photographers.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photography.photographers.dao.PhotographerRepository;
import com.photography.photographers.model.Photographer;
import com.photography.photographers.service.PhotoGrapherService;

@Service
public class PhotoGrapherServiceImpl implements PhotoGrapherService {

	@Autowired
	private PhotographerRepository repository;
	
	@Override
	public Photographer savePhotographer(Photographer photographer) {
		Photographer savedPhotographer = repository.save(photographer);
		return savedPhotographer;
	}

}

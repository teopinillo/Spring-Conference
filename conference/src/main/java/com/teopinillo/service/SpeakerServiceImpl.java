package com.teopinillo.service;

import java.util.List;

import com.teopinillo.Speaker;
import com.teopinillo.repository.HibernateSpeakerRepositoryImpl;
import com.teopinillo.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

	@Override
	public List<Speaker> findAll() {
		return repository.findAll();
	}

}

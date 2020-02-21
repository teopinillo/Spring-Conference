package com.teopinillo.repository;

import java.util.ArrayList;
import java.util.List;

import com.teopinillo.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	@Override
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<>();
		
		speakers.add( new Speaker ("Teo","Pinillo" ));
		speakers.add( new Speaker ("Tom","Williams"));
		speakers.add( new Speaker ("Robert","Sam"));
		
		return speakers;
		
	}

}

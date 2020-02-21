package com.teopinillo;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.teopinillo.service.SpeakerService;
import com.teopinillo.service.SpeakerServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ConferenceApplication {
	private static final Logger logger = 
			LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());
	 

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
		SpeakerService service = new SpeakerServiceImpl();
		logger.info("Speakers: " + service);
	}
}

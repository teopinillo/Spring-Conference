package com.teopinillo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.teopinillo.service.SpeakerService;
import com.teopinillo.service.SpeakerServiceImpl;

@SpringBootApplication
public class ConferenceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
		SpeakerService service = new SpeakerServiceImpl();
		
		
		for (Speaker s:service.findAll()) {
			System.out.println(s);
		}

	}
}

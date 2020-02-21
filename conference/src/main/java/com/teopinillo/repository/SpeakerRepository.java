package com.teopinillo.repository;

import java.util.List;

import com.teopinillo.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}
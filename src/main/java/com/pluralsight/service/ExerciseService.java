package com.pluralsight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

@Service
public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}
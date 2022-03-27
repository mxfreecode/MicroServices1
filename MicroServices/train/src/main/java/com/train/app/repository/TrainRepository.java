package com.train.app.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.train.app.entity.Train;

public interface TrainRepository extends CrudRepository<Train, Integer>{
	public abstract ArrayList<Train> findByDestination(String destination);
}

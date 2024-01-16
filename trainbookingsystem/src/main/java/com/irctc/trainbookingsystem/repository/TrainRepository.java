package com.irctc.trainbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.irctc.trainbookingsystem.model.TrainEntity;



@Repository
public interface TrainRepository extends JpaRepository<TrainEntity, Integer> {
	
	@Query("from TrainEntity where bookingdate='27-01-2024'")
	List<TrainEntity> findByDate(String bookingdate);

}


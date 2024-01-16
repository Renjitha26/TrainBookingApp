package com.irctc.trainbookingsystem.service;

import java.util.List;

import com.irctc.trainbookingsystem.model.TrainModel;



public interface TrainService {
	
    List<TrainModel> saveTrainDetail(TrainModel tm);
	
	List<TrainModel> getTrainDetail(String bookingdate);


}

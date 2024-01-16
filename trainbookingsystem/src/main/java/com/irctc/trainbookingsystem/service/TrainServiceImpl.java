package com.irctc.trainbookingsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.trainbookingsystem.model.TrainEntity;
import com.irctc.trainbookingsystem.model.TrainModel;
import com.irctc.trainbookingsystem.repository.TrainRepository;



@Service
public class TrainServiceImpl implements TrainService{
	@Autowired
	TrainRepository trainRepo;

	@Override
	public List<TrainModel> saveTrainDetail(TrainModel tm) {
		// TODO Auto-generated method stub
		List<TrainModel> trainList = new ArrayList<TrainModel>();
		TrainEntity trainEn = new TrainEntity();
		
		trainEn.setTrainnumber(tm.getTrainnumber());
		trainEn.setFromlocation(tm.getFromlocation());
		trainEn.setTolocation(tm.getTolocation());
		trainEn.setBookingdate(tm.getBookingdate());
		
		trainEn.setBookingclasses(tm.getBookingclasses());
		trainEn.setTrainname(tm.getTrainname());
		trainRepo.save(trainEn);
		
		List<TrainEntity> trainEnList = trainRepo.findAll();
		
		for(TrainEntity te : trainEnList) {
			
			trainList.add(new TrainModel(te.getTrainnumber(),te.getFromlocation(),te.getTolocation(),te.getBookingdate(),te.getBookingclasses(),te.getTrainname()));
			
		}
		return trainList;
	}

	@Override
	public List<TrainModel> getTrainDetail(String bookingdate) {
		// TODO Auto-generated method stub
		List<TrainModel> trainGetList = new ArrayList<TrainModel>();
	List<TrainEntity> trainEnList = trainRepo.findByDate(bookingdate);
		
		for(TrainEntity te : trainEnList) {
			
			trainGetList.add(new TrainModel(te.getTrainnumber(),te.getFromlocation(),te.getTolocation(),te.getBookingdate(),te.getBookingclasses(),te.getTrainname()));
			
		}
		
		
		return trainGetList;
	}



}
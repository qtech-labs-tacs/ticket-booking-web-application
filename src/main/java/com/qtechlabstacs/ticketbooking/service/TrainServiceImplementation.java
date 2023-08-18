package com.qtechlabstacs.ticketbooking.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qtechlabstacs.ticketbooking.dto.TrainDTO;
import com.qtechlabstacs.ticketbooking.model.Train;
import com.qtechlabstacs.ticketbooking.respository.TrainRepository;

@Service
public class TrainServiceImplementation {

	@Autowired
	private TrainRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	public Long createTrain(TrainDTO trainDTO) {

		Train trainModelObject = modelMapper.map(trainDTO, Train.class);
		Train trainModelSaved = repository.save(trainModelObject);
		return trainModelSaved.getTrainId();
	}

}

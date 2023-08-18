package com.qtechlabstacs.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qtechlabstacs.ticketbooking.dto.TrainDTO;
import com.qtechlabstacs.ticketbooking.service.TrainServiceImplementation;

@RestController
public class TrainController {

	@Autowired
	private TrainServiceImplementation trainService;

	@PostMapping("/api/v1/train")
	public ResponseEntity<Long> createTrain(@RequestBody TrainDTO trainDTO) {

		Long trainId = trainService.createTrain(trainDTO);
		return new ResponseEntity<Long>(trainId, HttpStatus.CREATED);

	}

}

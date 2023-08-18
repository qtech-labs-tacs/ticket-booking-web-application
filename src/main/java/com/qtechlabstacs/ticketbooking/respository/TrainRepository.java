package com.qtechlabstacs.ticketbooking.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qtechlabstacs.ticketbooking.model.Train;

@Repository
public interface TrainRepository extends CrudRepository<Train, Long>{

}

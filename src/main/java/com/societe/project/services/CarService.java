package com.societe.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.project.database.CarRepository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Car;
import com.societe.project.services.base.BaseService;

@Service
public class CarService extends BaseService<Car> {

	@Autowired
	private CarRepository carRepository;
	
	@Override
	protected BaseCRUDRepository<Car> getCRUDRepository() {
		return carRepository;
	}

	@Override
	protected List<Car> setItemsByCriterias(Car item, List<Car> result) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.CarSale.service;

import org.springframework.stereotype.Service;

import com.CarSale.repository.CarRepository;
import com.CarSale.model.Car;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void saveCar(Car car) {
        carRepository.saveAndFlush(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

}

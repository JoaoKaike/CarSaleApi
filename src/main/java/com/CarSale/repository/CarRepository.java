package com.CarSale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarSale.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    

}

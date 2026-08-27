package com.CarSale.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import com.CarSale.service.CarService;
import com.CarSale.model.Car;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<Void> createCar(@RequestBody Car car) {
        carService.saveCar(car);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Car> getCarById(@RequestParam Long id) {
        return ResponseEntity.ok(carService.getCarById(id));
        
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteCar(@RequestParam Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok().build();
    }

}

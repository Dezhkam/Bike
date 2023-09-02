package com.dezhkam.bike.controllers;

import com.dezhkam.bike.models.Bike;
import com.dezhkam.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
    @Autowired
    private BikeRepository bikeRepository;
    @GetMapping()
    public List<Bike> list(){
        return bikeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long Id){
        return bikeRepository.findById(Id).orElse(null);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);
    }
}

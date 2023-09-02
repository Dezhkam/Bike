package com.dezhkam.bike.controllers;

import com.dezhkam.bike.models.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
    @GetMapping()
    public List<Bike> list(){
        List<Bike> bikes = new ArrayList<>();
        return bikes;
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long Id){
        return new Bike();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){

    }
}

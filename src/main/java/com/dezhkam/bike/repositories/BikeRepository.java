package com.dezhkam.bike.repositories;

import com.dezhkam.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Long> {

}

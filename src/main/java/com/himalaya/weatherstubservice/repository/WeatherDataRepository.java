package com.himalaya.weatherstubservice.repository;

import com.himalaya.weatherstubservice.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherDataRepository extends JpaRepository<Weather, Integer> {

    Weather findTopByOrderByIdDesc();
}

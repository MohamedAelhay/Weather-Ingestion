package com.example.ingestionv1.service;

import com.example.ingestionv1.model.Weather;

import java.util.List;

public interface WeatherService {
    List<Weather> getAllWeatherData();
}

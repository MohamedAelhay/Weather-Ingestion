package com.example.ingestionv1.service.impl;

import com.example.ingestionv1.clients.weather.WeatherClient;
import com.example.ingestionv1.model.Weather;
import com.example.ingestionv1.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherClient weatherClient;

    @Override
    public List<Weather> getAllWeatherData() {

        return weatherClient.getAllWeather();
    }
}

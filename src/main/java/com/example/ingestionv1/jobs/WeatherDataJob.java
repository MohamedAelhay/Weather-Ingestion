package com.example.ingestionv1.jobs;

import com.example.ingestionv1.kafka.producers.WeatherKafkaProducer;
import com.example.ingestionv1.model.Weather;
import com.example.ingestionv1.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeatherDataJob {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private WeatherKafkaProducer weatherKafkaProducer;

    @Scheduled(fixedDelayString = "5000")
    public void runWeatherJob() {

        final List<Weather> weatherList = weatherService.getAllWeatherData();

        weatherList.forEach(weatherKafkaProducer::sendMessage);
    }
}

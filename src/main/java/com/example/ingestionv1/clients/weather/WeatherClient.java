package com.example.ingestionv1.clients.weather;


import com.example.ingestionv1.model.Weather;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.ingestionv1.clients.WeatherConfigClient;

import java.util.List;

@Log4j
@Component
public class WeatherClient {

    @Autowired
    private WeatherConfigClient weatherConfigClient;

    public List<Weather> getAllWeather() {

        try {

            return weatherConfigClient.getWeatherData();
        } catch (Exception ex) {

            log.error("Can't reach weather service");
        }

        return null;
    }
}

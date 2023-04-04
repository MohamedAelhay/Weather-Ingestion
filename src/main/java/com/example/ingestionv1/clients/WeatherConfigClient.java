package com.example.ingestionv1.clients;

import com.example.ingestionv1.model.Weather;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "${weather.url}", value = "weatherConfigClient")
public interface WeatherConfigClient {

    @GetMapping
    List<Weather> getWeatherData();
}

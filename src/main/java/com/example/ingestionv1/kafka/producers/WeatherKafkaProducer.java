package com.example.ingestionv1.kafka.producers;

import com.example.ingestionv1.model.Weather;

public interface WeatherKafkaProducer {

    void sendMessage(Weather weather);
}

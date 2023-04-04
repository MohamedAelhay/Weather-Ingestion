package com.example.ingestionv1.kafka.producers.impl;

import com.example.ingestionv1.kafka.producers.WeatherKafkaProducer;
import com.example.ingestionv1.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class WeatherKafkaProducerImpl implements WeatherKafkaProducer {

    @Value(value = "${kafka.topics.weatherTopic}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, Weather> kafkaTemplate;

    @Override
    public void sendMessage(Weather weather) {

        kafkaTemplate.send(topicName, weather);
    }
}

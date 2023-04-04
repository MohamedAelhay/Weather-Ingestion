package com.example.ingestionv1.model;

import lombok.*;

@Data
public class Weather {

    private Long id;

    private String location;

    private Coordinate coordinate;

    private String time;

    private int degree;
}

package com.example.api;


import lombok.Data;

import java.util.List;

@Data
public class WeatherModel {

    private WeatherMain main;

    @Data
    public static class WeatherMain{
        private double temp;
        private double pressure;
        private double humidity;
    }


}

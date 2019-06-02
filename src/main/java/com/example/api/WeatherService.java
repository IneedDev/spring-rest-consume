package com.example.api;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public WeatherModel getWheather(String city){

        return new RestTemplate().getForObject("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=42aa5a8d658eea4996bfcf0a7f592ef7", WeatherModel.class);
    //RestTemplate JSNO obiekt na java Obiekt
    }


    @Bean
    public RestTemplate getRestTemplate(){
        //zamiana api na obiektyu

        return new RestTemplate();
    }
}

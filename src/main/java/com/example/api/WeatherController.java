package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("weatherForm", new WeatherForm());
        return "index";}

    @PostMapping("/")
    public  String index (@ModelAttribute WeatherForm weatherForm, Model model){
        model.addAttribute("weather",weatherService.getWheather(weatherForm.getCity()));
        return "index";

        //callo do serwisu

    }



}

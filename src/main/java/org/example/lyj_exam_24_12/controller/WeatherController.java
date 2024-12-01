package org.example.lyj_exam_24_12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {
    @RequestMapping("/weather")
    public String showWeather() {
        return "/weather";
    }
}
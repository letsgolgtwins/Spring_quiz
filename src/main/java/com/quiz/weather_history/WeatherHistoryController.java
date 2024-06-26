package com.quiz.weather_history;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.weather_history.BO.WeatherHistoryBO;
import com.quiz.weather_history.domain.WeatherHistory;

@RequestMapping("/weather-history")
@Controller
public class WeatherHistoryController {

	@Autowired
	private WeatherHistoryBO weatherHistoryBO;
	
	// 추가하는 화면
	// http://localhost:8080/weather-history/add-weather-view
	@GetMapping("/add-weather-view")
	public String AddWeatherView() {
		return "weather_history/addWeather";
	}
	
	// 날씨 리스트 화면
	// http://localhost:8080/weather-history/weather-list-view
	@GetMapping("/weather-list-view")
	public String WeatherListView(Model model) {
		// select from db
		List<WeatherHistory> resultList = weatherHistoryBO.getWeatherHistory();				
		
		// model에 담기
		model.addAttribute("result", resultList);
		
		// 최종 화면
		return "weather_history/weatherList";
	}
	
	
	// db에 insert
	@PostMapping("/add-weather-history")
	public String WeatherHistory(
			WeatherHistory weatherHistory) {
		// db에 insert
		weatherHistoryBO.addWeatherHistory(weatherHistory);
		
		// 최종화면 
		return "redirect:/weather-history/weather-list-view";
		
	}
	
}

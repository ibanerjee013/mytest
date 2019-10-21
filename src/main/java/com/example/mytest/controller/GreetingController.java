package com.example.mytest.controller;

import java.net.MalformedURLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.pojo.Players;
import com.example.pojo.Standing;
import com.example.pojo.country;

@RestController
@RequestMapping(path = "/greeting")
public class GreetingController {
	
	
		     
 @Autowired
RestTemplate restTemplate;

	 @RequestMapping("/country")
	    public  ResponseEntity<List<country>> getCountry() throws MalformedURLException {
	//	 url= MyUri("https://apiv2.apifootball.com/?action=get_countries&APIkey=5eef0ac4ce857d075d57c054e9a787219b23c5cb1ac60b00b4425ed5487e5b56");
		 
	 
		 
		 ResponseEntity<List<country>> response = restTemplate.exchange(
				 "https://apiv2.apifootball.com/?action=get_countries&APIkey=5eef0ac4ce857d075d57c054e9a787219b23c5cb1ac60b00b4425ed5487e5b56",
								  HttpMethod.GET,
				  null,
				  new ParameterizedTypeReference<List<country>>(){});
		 
		 return response;
	    }
	 
	 @RequestMapping("/teams")
	    public  ResponseEntity<List<Team>> getTeams() throws MalformedURLException {
	//	 url= MyUri("https://apiv2.apifootball.com/?action=get_countries&APIkey=5eef0ac4ce857d075d57c054e9a787219b23c5cb1ac60b00b4425ed5487e5b56");
		 
	 
		 
		 ResponseEntity<List<Team>> response = restTemplate.exchange(
				 "https://apiv2.apifootball.com/?action=get_teams&league_id=148&APIkey=5eef0ac4ce857d075d57c054e9a787219b23c5cb1ac60b00b4425ed5487e5b56",
								  HttpMethod.GET,
				  null,
				  new ParameterizedTypeReference<List<Team>>(){});
		 
		 return response;
	    }
	 
	 
	 @RequestMapping("/player")
	    public  ResponseEntity<List<Players>> getPlayers() throws MalformedURLException {
	//	 url= MyUri("https://apiv2.apifootball.com/?action=get_countries&APIkey=5eef0ac4ce857d075d57c054e9a787219b23c5cb1ac60b00b4425ed5487e5b56");
	
	 
		 
		 ResponseEntity<List<Players>> response = restTemplate.exchange(
				 "https://apiv2.apifootball.com/?action=get_players&player_name=ronaldo cristiano&APIkey=5eef0ac4ce857d075d57c054e9a787219b23c5cb1ac60b00b4425ed5487e5b56",
								  HttpMethod.GET,
				  null,
				  new ParameterizedTypeReference<List<Players>>(){});
		 
		 return response;
	    }
	 
	 @RequestMapping("/standing")
	    public  ResponseEntity<List<Standing>> getstandings() throws MalformedURLException {
	
	// https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey=xxxxxxxxxxxxxx
	 
		 
		 ResponseEntity<List<Standing>> response = restTemplate.exchange(
				 "https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey=5eef0ac4ce857d075d57c054e9a787219b23c5cb1ac60b00b4425ed5487e5b56",
								  HttpMethod.GET,
				  null,
				  new ParameterizedTypeReference<List<Standing>>(){});
		 
		 return response;
	    }
	 
}

package com.example.mytest.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.pojo.Coache;
import com.example.pojo.Players;

@Component
public class Team {

	private String team_key;
	private String team_name;
	private String team_badge;
	private List<Players> players;
	private List<Coache> Coaches;
	
public Team() {
	
}

public Team(String team_key, String team_name, String team_badge, List<Players> players, List<Coache> coaches) {
	super();
	this.team_key = team_key;
	this.team_name = team_name;
	this.team_badge = team_badge;
	this.players = players;
	Coaches = coaches;
}

public String getTeam_key() {
	return team_key;
}

public void setTeam_key(String team_key) {
	this.team_key = team_key;
}

public String getTeam_name() {
	return team_name;
}

public void setTeam_name(String team_name) {
	this.team_name = team_name;
}

public String getTeam_badge() {
	return team_badge;
}

public void setTeam_badge(String team_badge) {
	this.team_badge = team_badge;
}

public List<Players> getPlayers() {
	return players;
}

public void setPlayers(List<Players> players) {
	this.players = players;
}

public List<Coache> getCoaches() {
	return Coaches;
}

public void setCoaches(List<Coache> coaches) {
	Coaches = coaches;
}


	
	
	
}

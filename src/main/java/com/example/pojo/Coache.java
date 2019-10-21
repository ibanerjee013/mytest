package com.example.pojo;

import org.springframework.stereotype.Component;

@Component
public class Coache {

	private String coach_name;
	private String coach_country;
	private String coach_age;

public Coache() {
	
}

public String getCoach_name() {
	return coach_name;
}

public void setCoach_name(String coach_name) {
	this.coach_name = coach_name;
}

public String getCoach_country() {
	return coach_country;
}

public void setCoach_country(String coach_country) {
	this.coach_country = coach_country;
}

public String getCoach_age() {
	return coach_age;
}

public void setCoach_age(String coach_age) {
	this.coach_age = coach_age;
}

public Coache(String coach_name, String coach_country, String coach_age) {
	super();
	this.coach_name = coach_name;
	this.coach_country = coach_country;
	this.coach_age = coach_age;
}


}

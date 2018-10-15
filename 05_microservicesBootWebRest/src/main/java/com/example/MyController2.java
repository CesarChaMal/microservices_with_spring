package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Player;
import com.example.domain.Team;

@RestController
public class MyController2 {

	private Team team;
	
	@PostConstruct
	public void init(){
		Set<Player> players =  new HashSet<>();
		players.add(new Player("Charlie Brown", "pitcher")); 
		players.add(new Player("Snoopy", "shortstop")); 
		
		team = new Team("California", "Peanuts", players);
	}
	
	@RequestMapping("/hi2")
	public Team hiThere(){
		return team;
	}
}

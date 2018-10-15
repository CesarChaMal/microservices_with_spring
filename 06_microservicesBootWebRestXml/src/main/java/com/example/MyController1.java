package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Player;
import com.example.domain.Team;

@Controller
public class MyController1 {

	private Team team;
	
	@PostConstruct
	public void init(){
		Set<Player> players =  new HashSet<>();
		players.add(new Player("Charlie Brown", "pitcher")); 
		players.add(new Player("Snoopy", "shortstop")); 
		
		team = new Team("California", "Peanuts", players);
	}
	
	@RequestMapping("/hi1")
	public @ResponseBody Team hiThere(){
		return team;
	}
}

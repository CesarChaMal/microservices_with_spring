package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TeamDao;
import com.example.domain.Player;
import com.example.domain.Team;

@RestController
public class MyController2 {

	@Autowired
	TeamDao teamDao;
	
	@RequestMapping("/teams2/{name}")
	public Team findTeam(@PathVariable String name){
		return teamDao.findByName(name);
	}
}

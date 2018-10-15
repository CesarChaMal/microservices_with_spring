package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.TeamDao;
import com.example.domain.Team;

@Controller
public class MyController1 {

	@Autowired
	TeamDao teamDao;
	
	@RequestMapping("/teams1/{name}")
	public @ResponseBody Team findTeam(@PathVariable String name){
		return teamDao.findByName(name);
	}
}

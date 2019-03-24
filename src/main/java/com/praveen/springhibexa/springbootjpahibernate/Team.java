package com.praveen.springhibexa.springbootjpahibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Team {
	
/*	@Id
	@GeneratedValue
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Column(name="name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER, mappedBy = "team")
	private List<Player> players;
	
	public Team() {
		
	}
	
	
*/	
}

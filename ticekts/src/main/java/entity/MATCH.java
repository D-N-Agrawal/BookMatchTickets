package com.matchBook.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MATCH {
	
	@Id
	private String matchId;
	
	private String stadium;
	private String team1;
	private String team2;
	
	//@Temporal(TemporalType.DATE)
	private String date;
	private int stdTickets;
	private int vipTickets;
	
	
	public  MATCH() {
		
	}
	

	public MATCH(String matchId, String stadium, String team1, String team2, String date, int stdTickets,
			int vipTickets) {
		super();
		this.matchId = matchId;
		this.stadium = stadium;
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.stdTickets = stdTickets;
		this.vipTickets = vipTickets;
	}



	public String getMatchId() {
		return matchId;
	}



	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}



	public String getStadium() {
		return stadium;
	}



	public void setStadium(String stadium) {
		this.stadium = stadium;
	}



	public String getTeam1() {
		return team1;
	}



	public void setTeam1(String team1) {
		this.team1 = team1;
	}


	
	public String getTeam2() {
		return team2;
	}



	public void setTeam2(String team2) {
		this.team2 = team2;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public int getStdTickets() {
		return stdTickets;
	}



	public void setStdTickets(int stdTickets) {
		this.stdTickets = stdTickets;
	}



	public int getVipTickets() {
		return vipTickets;
	}



	public void setVipTickets(int vipTickets) {
		this.vipTickets = vipTickets;
	}

	}


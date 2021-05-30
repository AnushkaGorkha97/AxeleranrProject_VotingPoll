package com.lti.core.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="votes")
@Table(name="Votes0")
public class Votes {
     
	@Id
	@Column(name="VoteId")
	private int voteId;
	
	@Column(name="Migeul")
	private int migeul;
	
	@Column(name="Charles")
	private int charles;
	
	@Column(name="Tolkien")
	private int tolkien;
	
	@Column(name="Antoine")
	private int antoine;


public int getVoteId() {
		return voteId;
	}

public void setVoteId(int voteId) {
		this.voteId = voteId;
	}

public int getMigeul() {
		return migeul;
	}

public void setMigeul(int migeul) {
		this.migeul = migeul;
	}

public int getCharles() {
		return charles;
	}

public void setCharles(int charles) {
		this.charles = charles;
	}

public int getTolkien() {
		return tolkien;
	}

public void setTolkien(int tolkien) {
		this.tolkien = tolkien;
	}

public int getAntoine() {
		return antoine;
	}

public void setAntoine(int antoine) {
		this.antoine = antoine;
	}

public Votes(int voteId, int migeul, int charles, int tolkien, int antoine) {
		super();
		this.voteId = voteId;
		this.migeul = migeul;
		this.charles = charles;
		this.tolkien = tolkien;
		this.antoine = antoine;
	}

public Votes() {
	}
}

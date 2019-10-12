package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Gourab Sarkar
 * @creation_date 27 Sep 2019 16:43 IST
 * @modification_date 27 Sep 2019 16:43 IST
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description This is a class Song for demonstrating One - To - Many relationship
 *
 */

@Entity
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SongID;
	private String songName;
	@ManyToOne
	@JoinColumn(name = "movie_ID")
	private Movie movie;
	
	public String getSongName() {
		return songName;
	}

	public Song(String songName) {
		this.songName = songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Song() {
		
	}
	
	public Song(int songID, String songName) {
		SongID = songID;
		this.songName = songName;
	}

	public int getSongID() {
		return SongID;
	}

	public void setSongID(int songID) {
		SongID = songID;
	}

	@Override
	public String toString() {
		return "Song [SongID=" + SongID + ", songName=" + songName + "]";
	}
	
}

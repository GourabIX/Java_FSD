package com.zensar.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeleteDemo {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Movie movie = s.get(Movie.class, 1);
		System.out.println(movie.getTitle());
		System.out.println(movie.getReleaseDate());
		List<Song> listOfSongs = movie.getListOfSongs();
		
		for (Song currSong: listOfSongs)
		{
			System.out.println(currSong);
		}
		
		if (movie != null)
		{
			s.delete(movie);
			s.save(movie);
		}
		else
		{
			System.out.println("Sorry! Movie not found!");
		}
		
		t.commit();
		s.close();
		System.exit(0);

	}

}

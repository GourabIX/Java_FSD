package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class OneToManyMappingDemo {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Movie movie = new Movie();
		movie.setTitle("Man of Steel");
		movie.setReleaseDate(LocalDate.of(2015, 8, 21));
		
		Song s1 = new Song();
		s1.setSongName("Jaani Dekha Hobe");
		
		Song s2 = new Song();
		s2.setSongName("ABCD");
		
		Song s3 = new Song();
		s3.setSongName("kdfkjdk");
		
		s1.setMovie(movie);
		s2.setMovie(movie);
		s3.setMovie(movie);
		
		List<Song> listOfSongs = new ArrayList<Song>();
		listOfSongs.add(s1);
		listOfSongs.add(s2);
		listOfSongs.add(s3);
		
		movie.setListOfSongs(listOfSongs);
		
		s.save(movie);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		t.commit();
		s.close();

	}

}

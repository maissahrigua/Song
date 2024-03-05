package test;

import java.util.List;



import metier.MetierImpl;
import metier.Song;

public class TestMetier {

	public static void main(String[] args) {
		
			MetierImpl metier= new MetierImpl();
			List<Song> songs = metier.getSongsParMotCle("Aff");
			for (Song p : songs)
			System.out.println(p.getNameSong());

	}

}

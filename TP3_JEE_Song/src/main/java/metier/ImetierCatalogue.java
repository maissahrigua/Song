package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<Song> getSongsParMotCle(String mc);
	public void addSong(Song s);
}

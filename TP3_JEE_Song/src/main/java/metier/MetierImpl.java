package metier;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Song> getSongsParMotCle(String mc) {
		List<Song> songs= new ArrayList<Song>();
		Connection conn=SingletonConnection.getConnection();
		try {
		
			PreparedStatement ps= conn.prepareStatement("select * from songs where nom_song  LIKE ?");
		
							ps.setString(1, "%"+mc+"%");
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						Song s = new Song();
						s.setIdSong(rs.getLong("ID_Song"));
						s.setNameSong(rs.getString("NOM_SONG"));
						s.setNameSinger(rs.getString("NOM_Singer"));
						songs.add(s);
					}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
			return songs;
	}
	@Override
	public void addSong(Song s) {
		// TODO Auto-generated method stub
	}
}

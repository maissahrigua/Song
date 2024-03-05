package metier;

import java.io.Serializable;
public class Song implements Serializable{
	private Long idSong;
	private String namesong;
	private String namesinger;
	public Song() {
	super();
	}
	
	public Song(String namesong, String namesinger) {
		super();
		this.namesong = namesong;
		this.namesinger = namesinger;
	}
	
	public Long getIdSong() {
		return idSong;
	}
	
	public void setIdSong(Long idSong) {
		this.idSong = idSong;
	}
	
	public String getNameSong() {
		return namesong;
	}
	
	public void setNameSong(String namesong) {
		this.namesong = namesong;
	}
	
	public String getNameSinger() {
		return namesinger;
	}
	
	public void setNameSinger(String namesinger) {
		this.namesinger = namesinger;
	}
}

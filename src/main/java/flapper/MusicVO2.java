package flapper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// JPA 때문인가 hibernate 패키지에 있는 entitiy 쓰지 않음...

//import org.hibernate.annotations.Entity;

//
//@Entity(name = "MusicVO")
//@Table(name="Music_Table")
public class MusicVO2 {
//	@Id
//	@Column
	private int musicID;
//	@Column
	String musicTitle;
//	@Column
	private String genre;
//	@Column
	private String hash_tags;
//	@Column
	private String lyrics;
//	@Column
	private String musicNode;
//	@Column
	private int albumID;
//	@Column
	private String composerID;
//	@Column
	private String lyricistID;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MusicVO(");
		sb.append("musicID : ");
		sb.append(musicID);
		sb.append(", musicTitle : ");
		sb.append(musicTitle);
		sb.append(", genre : ");
		sb.append(genre);
		sb.append(", albumID : ");
		sb.append(albumID);
		sb.append(")");
		return sb.toString();
	}
	
	public MusicVO2(int musicID) {
		super();
		this.musicID = musicID;
	}

	public MusicVO2() {
		super();
	}

	public int getMusicID() {
		return musicID;
	}
	public void setMusicID(int musicID) {
		this.musicID = musicID;
	}
	public String getMusicTitle() {
		return musicTitle;
	}
	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getHash_tags() {
		return hash_tags;
	}
	public void setHash_tags(String hash_tags) {
		this.hash_tags = hash_tags;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getMusicNode() {
		return musicNode;
	}
	public void setMusicNode(String musicNode) {
		this.musicNode = musicNode;
	}
	public int getAlbumID() {
		return albumID;
	}
	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}
	public String getComposerID() {
		return composerID;
	}
	public void setComposerID(String composerID) {
		this.composerID = composerID;
	}
	public String getLyricistID() {
		return lyricistID;
	}
	public void setLyricistID(String lyricistID) {
		this.lyricistID = lyricistID;
	}
}

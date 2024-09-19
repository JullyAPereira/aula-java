package br.com.smartweb.midias;

public class Cd extends Item {
	private String artist;
	private int numberOfTracks;
	
	

	public Cd(String artist, int numberOfTracks) {
		super();
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
	}

	@Override
	public String toString() {
		return "Cd [artist=" + artist + ", numberOfTracks=" + numberOfTracks + "]";
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}


	
	
	

}

package br.com.smartweb.midias;

public class VideoGame extends Item {
	private int numberOfPlayers;
	private String plataform;
	
	public VideoGame(int numberOfPlayers, String plataform) {
		super();
		this.numberOfPlayers = numberOfPlayers;
		this.plataform = plataform;
	}

	@Override
	public String toString() {
		return "VideoGame [numberOfPlayers=" + numberOfPlayers + ", plataform=" + plataform + "]";
	}
	

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}
	

}

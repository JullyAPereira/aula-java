package br.com.smartweb.midias;

public class Item {
	private String title;
	private int PlayingTime;
	private boolean gotIt; 
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String title, int playingTime, boolean gotIt) {
		super();
		this.title = title;
		PlayingTime = playingTime;
		this.gotIt = gotIt;
	}
	@Override
	public String toString() {
		return "Item [title=" + title + ", PlayingTime=" + PlayingTime + ", gotIt=" + gotIt + "]";
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPlayingTime() {
		return PlayingTime;
	}
	public void setPlayingTime(int playingTime) {
		PlayingTime = playingTime;
	}
	public boolean isGotIt() {
		return gotIt;
	}
	public void setGotIt(boolean gotIt) {
		this.gotIt = gotIt;
	}
	
}

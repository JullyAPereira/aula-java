package br.com.smartweb.midias;

public class Dvd extends Item {

	private String director;

	public Dvd(String director) {
		super();
		this.director = director;
	}

	@Override
	public String toString() {
		return "Dvd [director=" + director + "]";
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}

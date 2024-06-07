package hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Media implements Playable {
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;
    private int id;
    public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
        this.setId(++nbDigitalVideoDiscs);
    }
	public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
        this.setId(++nbDigitalVideoDiscs);
        this.id = id;
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DigitalVideoDisc(String title) {
        super(title);
        this.director = "";
        this.length = 0;
        this.setId(++nbDigitalVideoDiscs);
    }
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return getId() + ". DVD - " + getTitle() + " - " + getCategory() + " - " + director
                + " - " + length + ": " + getCost() + "$";
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }
}

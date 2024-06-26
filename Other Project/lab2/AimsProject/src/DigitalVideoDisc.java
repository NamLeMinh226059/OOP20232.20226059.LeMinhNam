

public class DigitalVideoDisc 
{
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.nbDigitalVideoDisc++;
		this.id = this.nbDigitalVideoDisc;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.nbDigitalVideoDisc++;
		this.id= this.nbDigitalVideoDisc;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.nbDigitalVideoDisc++;
		this.id= this.nbDigitalVideoDisc;
	}
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc =0;
	protected int id;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.nbDigitalVideoDisc++;
		this.id= this.nbDigitalVideoDisc;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public int getnb()
	{
		return this.nbDigitalVideoDisc;
	}
	
}

package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> author = new ArrayList <String>();
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book() {
		// TODO Auto-generated constructor stub

	}
	public Book(String title, String category, float cost) {
	    super(title, category, cost);
	}
	public Book(String title, String category, float cost, List<String> author) {
	    super(title, category, cost);
	    this.author = author;
	}
	public Book(String title, String category, float cost, List<String> author, int id) {
	    super(title, category, cost);
	    this.author = author;
	    this.id = id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> getAuthor() {
		return author;
	}

	public void setAuthor(List<String> author) {
		this.author = author;
	}
	
	public void addAuthor(String authorname) {
		boolean check = false;
		for (String name: author) {
			if (name.equals(authorname)) {
				check = true;
			}
			
		}
		if (!check) {
			author.add(authorname);
		}
	}
	public void removeAuthor(String authorname) {
		boolean check = false;
		for (String name: author) {
			if (name.equals(authorname)) {
				check = true;
			}
			
		}
		if (check) {
			author.remove(authorname);
		}
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Book Information:\n");
	    sb.append("Title: ").append(getTitle()).append("\n");
	    sb.append("Category: ").append(getCategory()).append("\n");
	    sb.append("Cost: ").append(getCost()).append("\n");
	    sb.append("Authors: ").append(getAuthor()).append("\n");
	    sb.append("ID: ").append(getId()).append("\n");
	    return sb.toString();
	}
}

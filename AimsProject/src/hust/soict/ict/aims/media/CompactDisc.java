package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Media implements Playable {
	private String artist;
	private ArrayList <Track> track = new ArrayList<>();
	public CompactDisc(String title, String category, float cost) {
        super(title,category, cost); // Call the Media constructor with the title parameter
    }
	public CompactDisc(String title, String category, float cost, int id) {
        super(title,category, cost,id); // Call the Media constructor with the title parameter
        
    }
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public CompactDisc(String title) {
        super(title); // Call the Media constructor with the title parameter
    }
	public void addTrack(Track newtrack) {
		boolean check = false;
		for (Track t:track) {
			if (newtrack.equals(t)) {
				check = true;
			}
		}
		if (!check) {
			track.add(newtrack);
		}
	}
	public void removeTrack(Track newtrack) {
		boolean check = false;
		for (Track t:track) {
			if (newtrack.equals(t)) {
				check = true;
			}
		}
		if (check) {
			track.remove(newtrack);
		}
	}
	public int getLength() {
		int sum = 0;
		for (Track t:track) {
			sum  += t.getLength();
		}
		return sum;
	}
	@Override
	public void play() {
		for (Track t : track) {
	        t.play(); // Call the play() method for each track
	    }
		
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Compact Disc Information:\n");
	    sb.append("Title: ").append(getTitle()).append("\n");
	    sb.append("Category: ").append(getCategory()).append("\n");
	    sb.append("Cost: ").append(getCost()).append("\n");
	    sb.append("Artist: ").append(artist).append("\n");
	    sb.append("Number of Tracks: ").append(track.size()).append("\n");
	    sb.append("Total Length: ").append(getLength()).append(" minutes").append("\n");
	    sb.append("ID: ").append(getId()).append("\n");
	    return sb.toString();
	}


}

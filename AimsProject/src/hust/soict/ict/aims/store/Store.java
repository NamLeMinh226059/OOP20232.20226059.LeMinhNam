package hust.soict.ict.aims.store;
import java.util.ArrayList;

import hust.soict.ict.aims.media.Media;;
public class Store {

    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	 public void addMedia(Media media) {
	        for (Media item : itemsInStore) {
	            if (item.isMatch(media.getTitle())) {
	                System.out.println("This media item already exists in the store.");
	                return;
	            }
	        }

	        itemsInStore.add(media);
	        System.out.println("The media item has been added to the store.");
	    }
	
	 public void removeMedia(Media media) {
	        for (int i = 0; i < itemsInStore.size(); i++) {
	            Media item = itemsInStore.get(i);
	            if (item.isMatch(media.getTitle())) {
	                itemsInStore.remove(i);
	                System.out.println("The media item has been removed from the store.");
	                return;
	            }
	        }
		
		System.out.println("This DVD is not exist");
		return;
	}
	 public boolean removeMedia(String mediaName) {
		    for (int i = 0; i < itemsInStore.size(); i++) {
		        Media item = itemsInStore.get(i);
		        if (item.getTitle().equalsIgnoreCase(mediaName)) {
		            itemsInStore.remove(i);
		            System.out.println("The media item has been removed from the store.");
		            return true;
		        }
		    }
		    System.out.println("This media item does not exist.");
		    return false;
		}

	
	 public Media searchByTitle(String title) {
		    for (Media media : itemsInStore) {
		        if (media.isMatch(title)) {
		            return media;
		        }
		    }
		    return null; // Media not found
		}

	public Media searchByID(int id) {
		    for (Media media : itemsInStore) {
		        if (media.isMatch(id)) {
		            return media;
		        }
		    }
		    return null; // Media not found
		}
	public void print() {
		System.out.println("Store has following items");
		for (int i = 0; i < itemsInStore.size(); i++) {
			
			 System.out.println((i+1) + ". " + itemsInStore.get(i).toString());
		}
	}

}
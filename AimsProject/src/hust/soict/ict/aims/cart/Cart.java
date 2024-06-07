package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart   {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemOrdered = new ArrayList<Media>();
    public Cart() {
        itemOrdered = new ArrayList<Media>();
    }
	
    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < itemOrdered.size(); i++) {
            sum += itemOrdered.get(i).getCost();
        }
        return sum;
    }
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemOrdered.size(); i++) {
            Media media = itemOrdered.get(i);
            System.out.println((i + 1) + ".ID" + media.getId() + "-" + media.getTitle() + "-" + media.getCategory() + ":" + media.getCost() + "$");
        }
        System.out.println("Total Cost: " + totalCost());
    }
	
    public Media searchByTitle(String title) {
        for (Media media : itemOrdered) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        return null; // If the media is not found
    }

    public ArrayList<Media> filterByID(int id) {
        ArrayList<Media> filteredItems = new ArrayList<Media>();
        for (Media media : itemOrdered) {
            if (media.isMatch(id)) {
                filteredItems.add(media);
            }
        
        }
        for (Media media: filteredItems) {
        	System.out.println(media.toString());
        }
        return filteredItems;
    }

    public ArrayList<Media> filterByTitle(String title) {
        ArrayList<Media> filteredItems = new ArrayList<Media>();
        for (Media media : itemOrdered) {
            if (media.isMatch(title)) {
                filteredItems.add(media);
            }
        }
        for (Media media: filteredItems) {
        	System.out.println(media.toString());
        }
        return filteredItems;
    }


    public void searchByID(int id) {
        boolean check = false;
        for (int i = 0; i < itemOrdered.size(); i++) {
            Media media = itemOrdered.get(i);
            if (media.isMatch(id)) {
                System.out.println(media.toString());
                check = true;
                return;
            }
        }
        if (!check) {
            System.out.println("This DVD is not in the cart");
        }
    }
    public void addMedia(Media media) {
        if (itemOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemOrdered.add(media);
            System.out.println("Added media to cart: " + media.getTitle());
        } else {
            System.out.println("The cart is full. Cannot add more media.");
        }
    }
    
    public void removeMedia(Media media) {
        if (itemOrdered.contains(media)) {
            itemOrdered.remove(media);
            System.out.println("Removed media from cart: " + media.getTitle());
        } else {
            System.out.println("The media is not in the cart.");
        }
    }
    public boolean removeMedia(String mediaName) {
	    for (int i = 0; i < itemOrdered.size(); i++) {
	        Media item = itemOrdered.get(i);
	        if (item.getTitle().equalsIgnoreCase(mediaName)) {
	        	itemOrdered.remove(i);

	            return true;
	        }
	    }
	    System.out.println("This media item does not exist.");
	    return false;
	}
    public ArrayList<Media> getItemOrdered() {
        return itemOrdered;
    }
    public void sortByTitle() {
//    	Following code sort the items in itemOrdered in the order with respect to custom logic defined in compare_by_title_cost.
        Collections.sort(itemOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Media sorted by title and cost:");

    }

    public void sortByCost() {
//    	Following code sort the items in itemOrdered in the order with respect to custom logic defined in compare_by_cost_title.
        Collections.sort(itemOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Media sorted by cost and title:");

    }



}
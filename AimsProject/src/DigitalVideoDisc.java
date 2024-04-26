package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + " - Category: " + getCategory() + " - Director: " + getDirector() + " - Length: " + getLength();
    }




/*
Reading Assignment: When should accessor methods be used?
-> When we want to protect the internal state of an object from unintended modification by external code.
Moreover, this makes the codes easier to read and more maintainable.
*/


/*
If you create a constructor method to build a DVD by title then create a constructor method to build
a DVD by category. Does JAVA allow you to do this?

-> Yes, it does. There can be multiple constructer methods at the same time.
*/

}
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered= stt();
	public int stt() {
		int aaa = 0;
		for (int i=0;i<itemsOrdered.length;i++) {
			if (itemsOrdered[i] != null) {
				aaa++;
			}
		}
		return aaa;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("The disc has been added");
		}
    }
	public void addDigitalVideoDisc(DigitalVideoDisc[] discs) {
	    for (DigitalVideoDisc disc : discs) {
	        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
	            System.out.println("The cart is almost full");
	            break;
	        } else {
	            itemsOrdered[qtyOrdered] = disc;
	            qtyOrdered++;
	            System.out.println("The disc has been added");
	        }
	    }
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    addDigitalVideoDisc(new DigitalVideoDisc[]{dvd1, dvd2});
	}
	
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("items does not exist");
			return;
		}
		for(int i=0;i<itemsOrdered.length;i++) {
			if (itemsOrdered[i] == disc) {
				if (i == itemsOrdered.length - 1) {
					itemsOrdered[i] = null;
					break;
				} else {
					for(int j=i;j<itemsOrdered.length;j++)
					{
		                
		                if(j+1 == itemsOrdered.length-1) {
		                	itemsOrdered[j]=itemsOrdered[j+1];
		                	itemsOrdered[j+1] = null;
		                	qtyOrdered --;	          
		                	break;
		                }
		                itemsOrdered[j]=itemsOrdered[j+1];
					}
				}
			}
			
		}
		
	}
	
	 public float totalCost() {
	        float totalCost = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            totalCost += itemsOrdered[i].getCost();
	        }
	        return totalCost;
	 }
}
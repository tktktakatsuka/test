package five;

class Item{
	String name ;
	int price = 100;
	
	
}


public class Main5{
	public static void main(String[] args) {
		Item[] items = new Item[3];
		int total = 0;
		for(int i = 0; i <items.length; i++) {
			total = items[i].price;
		}
		System.out.println(total);
	}
	

}

public class Main6_2{
	public static void main(String[] args) {
		Item a = new Item();
		Item b = new Item();
		a.name = "apple";
		b.price = 100;
		a.price = 200;
		b.name = "banana";
		
		
		a.printInfo();
		b.printInfo();
	}
}


class Item{	
	public String name;
	public int price;
	
	public void printInfo() {
		System.out.println(name +"," + price);
}

}
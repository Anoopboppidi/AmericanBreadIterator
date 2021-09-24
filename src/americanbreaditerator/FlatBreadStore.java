package americanbreaditerator;

public class FlatBreadStore implements Store{
	static final int MAX_BREAD = 12;
	int numberOfBread = 0;
	Bread[] breadItems;
	
	public FlatBreadStore() {
		breadItems = new Bread[MAX_BREAD];
		addBread("Tortilla ", " Are best eaten with vegetables, spices, and flavors.", 20.0);
		addBread("Pita ", " Are baked at high temperatures due to which the bread puffs up in the ovens and forms a pocket in the center after getting separated", 12.0);
		addBread("Focaccia", "Contains olive oil, salt, and herbs, and is mostly flavored with rosemary", 4.0);
		addBread("Naan", " Contains typical ingredients including wheat flour, water, salt, yeast, and milk or yogurt.", 7.5);

		
	}
	public void addBread(String name, String description, double price) {
		Bread bread = new Bread(name, description, price);
		
		if(numberOfBread >= MAX_BREAD) {
			System.err.println("Cannot add more bread to Store");
		}
		else {
			breadItems[numberOfBread] = bread;
			
			numberOfBread = numberOfBread + 1;
		}
	}
	public Bread[] getBread() {
		return breadItems;
	}
	public Iterator createIterator() {
		return new FlatBreadStoreIterator(breadItems);
	}
	
}

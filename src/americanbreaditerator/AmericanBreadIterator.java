package americanbreaditerator;

public class AmericanBreadIterator {

	public static void main(String[] args) {
		Store flatBreadStore = new FlatBreadStore();
		Store ryeStore = new RyeStore();
		
		Attendant attendant = new Attendant(ryeStore, flatBreadStore);
		
		attendant.printBread();
		

	}

}

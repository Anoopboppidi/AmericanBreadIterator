package americanbreaditerator;

public class Attendant {
	Store ryeStore;
	Store flatBreadStore;
	
	public Attendant(Store ryeStore, Store flatBreadStore) {
		this.ryeStore = ryeStore;
		this.flatBreadStore = flatBreadStore;
	}
	public void printBread() {
		Iterator ryeStoreIterator = ryeStore.createIterator();
		Iterator flatBreadStoreIterator = flatBreadStore.createIterator();
		
		System.out.println("\n----------Rye Bread-----------\n");
		printBread(ryeStoreIterator);
		System.out.println("\n----------Flat Bread----------\n");
		printBread(flatBreadStoreIterator);
	}
	private void printBread(Iterator iterator) {
		while(iterator.hasNext()) {
			Bread bread = iterator.next();
			System.out.print(bread.getName() + " , ");
			System.out.print(bread.getDescription() + " , ");
			System.out.println(bread.getPrice());
		}
	}
}

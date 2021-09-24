package americanbreaditerator;

public class FlatBreadStoreIterator implements Iterator{
	Bread[] breadItems;
	int position = 0;
	public FlatBreadStoreIterator(Bread[] breadItems) {
		this.breadItems = breadItems;
		
	}
	public Bread next() {

		Bread bread = breadItems[position];
		position = position + 1;
		return bread;
		
	}
	public boolean hasNext() {

		if( position >= breadItems.length || breadItems[position] == null){
			return false;
		}
		else {
			return true;
		}
	}
	
}

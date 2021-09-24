package americanbreaditerator;

import java.util.ArrayList;
import java.util.List;
public class RyeIterator implements Iterator{
	List<Bread> breads;
	int position = 0;
	
	public RyeIterator(List<Bread> breads) {
		this.breads = breads;
	}
	public Bread next() {
		Bread bread = breads.get(position);
		position = position + 1;
		return bread;

	}
	public boolean hasNext() {

		if (position >= breads.size()) {
			return false;
		}
		else {
			return true;
		}
		
	}
}

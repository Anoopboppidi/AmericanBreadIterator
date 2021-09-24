package americanbreaditerator;
import java.util.*;
public class RyeStore implements Store {

	List<Bread> breads;
	public RyeStore() {
		breads = new ArrayList<Bread>();
		addBread("Dark rye "," dark rye is made of coarsely-ground flour ground from the endosperm with some of the bran and germ included", 3.5);
		addBread("Marbled rye "," is traditionally the combination of dark and light rye", 1.2);
		addBread("Light rye ","Light rye uses flour made only of the endosperm which is ground into fine flour.", 2.2);
		addBread("Pumpernickel ","the rye berry is boiled and steamed to soften it enough to make the bread. The end result is a dark and fairly heavy loaf of bread.", 1.0);
		
	}
	public void addBread(String name, String description, double price) {
		Bread bread = new Bread(name, description, price);
		breads.add(bread);
		
	}
	public List<Bread> getStoreBread(){
		return breads;
	}
	public String toString() {
		return "Rye store bread";
	}
	public Iterator createIterator() {
		return new RyeIterator(breads);
	}
}

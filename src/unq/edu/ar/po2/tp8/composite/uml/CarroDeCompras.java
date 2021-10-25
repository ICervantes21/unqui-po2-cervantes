package unq.edu.ar.po2.tp8.composite.uml;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	
	private List<Product> elements = new ArrayList<Product>();

	public List<Product> getElements() {
		return elements;
	}

	public void setElements(List<Product> elements) {
		this.elements = elements;
	}
	
	public int totalRounded() {
		Float total = this.total();
		return total.intValue();
		
	}
	
	public float total() {
		float total = 0;
		for (Product i : elements) {
			total = total + i.getPrice();
		}
		return total;
	}

}

package cz.expertkom.ju.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PriceProducts {
	
	List<PriceProduct> priceProducts;

	/* ------------------------------------------------------- */
	
	public List<PriceProduct> getPriceProducts() {
		return priceProducts;
	}

	public void setPriceProducts(List<PriceProduct> priceProducts) {
		this.priceProducts = priceProducts;
	}
	
	

}

package cz.expertkom.ju.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PriceProductDto {
	
	private String nameProduct;
	private String productURI;
	private String priceWithVAT;
	private String priceWithOutVAT;
	
	/* --------------------------------------------------------- */
	
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getProductURI() {
		return productURI;
	}
	public void setProductURI(String productURI) {
		this.productURI = productURI;
	}
	public String getPriceWithVAT() {
		return priceWithVAT;
	}
	public void setPriceWithVAT(String priceWithVAT) {
		this.priceWithVAT = priceWithVAT;
	}
	public String getPriceWithOutVAT() {
		return priceWithOutVAT;
	}
	public void setPriceWithOutVAT(String priceWithOutVAT) {
		this.priceWithOutVAT = priceWithOutVAT;
	}

}

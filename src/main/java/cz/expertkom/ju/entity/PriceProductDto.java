package cz.expertkom.ju.entity;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PriceProductDto {
	
	private String nameProduct;
	private String productURI;
	private String priceWithVAT;
	private String priceWithOutVAT;
	private LocalDateTime insertedDateTime;
	private LocalDateTime updatedDateTime;
	
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
	public LocalDateTime getInsertedDateTime() {
		return insertedDateTime;
	}
	public void setInsertedDateTime(LocalDateTime insertedDateTime) {
		this.insertedDateTime = insertedDateTime;
	}
	public LocalDateTime getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	
}

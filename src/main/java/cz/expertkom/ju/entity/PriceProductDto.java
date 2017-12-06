package cz.expertkom.ju.entity;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PriceProductDto {
	
	private String nameProduct;
	private String productURI;
	private String priceWithVAT;
	private String priceWithOutVAT;
	private Date insertedDateTime;
	private Calendar updatedDateTime;
	
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
	public Date getInsertedDateTime() {
		return insertedDateTime;
	}
	public void setInsertedDateTime(Date insertedDateTime) {
		this.insertedDateTime = insertedDateTime;
	}
	
	
}

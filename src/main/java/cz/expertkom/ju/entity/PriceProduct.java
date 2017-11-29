package cz.expertkom.ju.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class PriceProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nameProduct")
	private String nameProduct;

	@Column(name="productURI")
	private String productURI;

	@Column(name="priceWithVAT")
	private String priceWithVAT;
	
	@Column(name="priceWithOutVAT")
	private String priceWithOutVAT;

	@Column(name="insertedDateTime")
	private LocalDateTime insertedDateTime;
	
	@Column(name="updatedDateTime")
	private LocalDateTime updatedDateTime;
	
	/* -------------------------------------------------------- */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

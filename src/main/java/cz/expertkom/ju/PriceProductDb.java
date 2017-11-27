package cz.expertkom.ju;

import cz.expertkom.ju.entity.PriceProductDto;
import cz.expertkom.ju.entity.PriceProducts;

public interface PriceProductDb {
	
	/* přidá záznam do tabulky */
	public void insertPriceproduct(PriceProductDto priceProductDto );
	
	/* vrátí všechny záznamy z tabulky */
	public PriceProducts geAllProducts();

}

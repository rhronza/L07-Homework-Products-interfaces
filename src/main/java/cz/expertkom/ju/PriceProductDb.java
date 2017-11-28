package cz.expertkom.ju;

import cz.expertkom.ju.entity.PriceProduct;
import cz.expertkom.ju.entity.PriceProductDto;
import cz.expertkom.ju.entity.PriceProducts;

public interface PriceProductDb {
	
	/* přidá záznam do tabulky */
	public void insertPriceproduct(PriceProductDto priceProductDto );
	
	/* vrátí všechny záznamy z tabulky */
	public PriceProducts getAllProducts();
	
	/* vrátí záznam Ppodle zadaného id z tabulky */
	public PriceProducts getOneProductToList(Long id);
	
	/* ruší záznam podle vstupního id */
	public void deletePriceProduct(Long id);
	/* provádí změnu záznamu tabulky podle id a nové hodnoty PriceProductDto */ 
	public void updatePriceProduct(Long id, PriceProductDto priceProductDto);

}

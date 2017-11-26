package cz.expertkom.ju;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cz.expertkom.ju.entity.PriceProduct;

@Repository
public interface PriceProductRepository extends JpaRepository<PriceProduct, Long>{

}

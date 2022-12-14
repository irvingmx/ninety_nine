package irvingmx.ninety_nine.store.repository;

import irvingmx.ninety_nine.store.entity.CompanyEntity;
import irvingmx.ninety_nine.store.entity.SharePriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SharePriceRepository extends JpaRepository<SharePriceEntity, Long> {

    public List<SharePriceEntity> findByCompany(CompanyEntity companyEntity);
}

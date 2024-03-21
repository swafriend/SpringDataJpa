package jp.co.itrade.j1.springdatajpasample.repository;

import jp.co.itrade.j1.springdatajpasample.entity.MstFixMarketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MstFixMarketRepository extends JpaRepository<MstFixMarketEntity, String> {
}

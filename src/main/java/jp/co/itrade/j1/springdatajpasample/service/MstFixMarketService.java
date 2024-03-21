package jp.co.itrade.j1.springdatajpasample.service;

import jp.co.itrade.j1.springdatajpasample.entity.MstFixMarketEntity;
import jp.co.itrade.j1.springdatajpasample.repository.MstFixMarketRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstFixMarketService {

    private final MstFixMarketRepository mstFixMarketRepository;

    public MstFixMarketService(MstFixMarketRepository mstFixMarketRepository) {
        this.mstFixMarketRepository = mstFixMarketRepository;
    }

    public List<MstFixMarketEntity> findAll() {
        return mstFixMarketRepository.findAll();
    }

}

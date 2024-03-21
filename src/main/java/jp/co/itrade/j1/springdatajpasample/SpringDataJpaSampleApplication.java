package jp.co.itrade.j1.springdatajpasample;

import jakarta.annotation.PostConstruct;
import jp.co.itrade.j1.springdatajpasample.entity.MstFixMarketEntity;
import jp.co.itrade.j1.springdatajpasample.service.MstFixMarketService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EntityScan("jp.co.itrade.j1.springdatajpasample.entity")
@EnableJpaRepositories("jp.co.itrade.j1.springdatajpasample")
public class SpringDataJpaSampleApplication {

	private final MstFixMarketService mstFixMarketService;

	public SpringDataJpaSampleApplication(MstFixMarketService mstFixMarketService) {
		this.mstFixMarketService = mstFixMarketService;
	}

	public static void main(String[] args) {

//		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("spring-jpa.xml");

		SpringApplication.run(SpringDataJpaSampleApplication.class, args);

	}

	@PostConstruct
	public void init(){
		List<MstFixMarketEntity> mstFixMarketEntityList = mstFixMarketService.findAll();
		System.out.println(mstFixMarketEntityList);
		mstFixMarketEntityList.forEach(System.out::println);
	}

}

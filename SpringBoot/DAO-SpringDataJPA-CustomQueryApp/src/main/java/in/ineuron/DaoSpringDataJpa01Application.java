package in.ineuron;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineMgmtService service = factory.getBean(ICoronaVaccineMgmtService.class);

		 service.fetchVaccineByCompany("serum").forEach(System.out::println);
		// service.fetchVaccineByPricesLessThan(450.5).forEach(System.out::println);

//		List<String> countries = new ArrayList<String>();
//		countries.add("CHINA");
//		countries.add("Russia");
//		// service.searchVaccineByCountriesAndPriceRange(countries, 200.0,
//		// 500.0).forEach(System.out::println);
//
//		service.fetchVaccineNotByCountry(countries).forEach(System.out::println);;
		((ConfigurableApplicationContext) factory).close();
	}
}

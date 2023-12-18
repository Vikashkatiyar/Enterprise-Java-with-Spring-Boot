package in.ineuron;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ICoronaVaccineMgmtService;
import in.ineuron.type.ResultView1;
import in.ineuron.type.ResultView2;
import in.ineuron.type.ResultView3;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineMgmtService service = factory.getBean(ICoronaVaccineMgmtService.class);

		service.searchVaccineByCompany("bharathbiotech", ResultView2.class).forEach(view -> {
			System.out.println(view.getRegNo() + " " + view.getCountry() + " " + view.getPrice());
		});

		service.searchVaccineByCompany("serum", ResultView1.class).forEach(view -> {
			System.out.println(view.getName() + " " + view.getCompany());
		});
		service.searchVaccineByCompany("serum", ResultView3.class).forEach(view -> {
			System.out.println(view.getCompany()+" "+view.getName()+" "+view.getPrice());
		});

		((ConfigurableApplicationContext) factory).close();
	}
}

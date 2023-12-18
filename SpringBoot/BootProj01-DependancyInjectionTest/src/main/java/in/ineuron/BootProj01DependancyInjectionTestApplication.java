package in.ineuron;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.comp.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependancyInjectionTestApplication {

	static {
		System.out.println("BootProj01DependancyInjectionApplication.class file loading...");
	}

	public BootProj01DependancyInjectionTestApplication() {
		System.out.println("BootProj01DependancyInjectionApplication :: Zero param constructor...");
	}

	@Bean(name = "ldt")
	public LocalDateTime createLocalDateTimeObj() {
		System.out.println("BootProj01DependancyInjectionApplication.createLocalDateTimeObj()");
		LocalDateTime ldt = LocalDateTime.now();
		return ldt;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProj01DependancyInjectionTestApplication.class, args);
		System.out.println("Implementation class is :: " + context.getClass().getName());

		System.out.println("****Container stared******\n");
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		String msg = wmg.generateWishMessage("sachin");
		System.out.println(msg);
		
		System.out.println("Bean id are :: "+Arrays.toString(context.getBeanDefinitionNames()));

		((ConfigurableApplicationContext) context).close();
		System.out.println("\n*****Container stopped*******");

	}

}

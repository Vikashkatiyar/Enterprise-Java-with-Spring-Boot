package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.service.IPurchaseOrder;

@SpringBootApplication
public class SpringBootMailAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootMailAppApplication.class, args);

		IPurchaseOrder order = context.getBean(IPurchaseOrder.class);
		try {
			String msg = order.purchase(new String[] { "fossil-Chronography", "USPOLO-Tshirt", "Shoes" },
					new double[] { 12000.0D, 5000.0D, 6000.0D },
					new String[] { "vikashktr018@gmail.com", "rishabktr018@gmail.com", "arpitkatiyar09197@gmail.com" });
			System.out.println(msg);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) context).close();
	}

}

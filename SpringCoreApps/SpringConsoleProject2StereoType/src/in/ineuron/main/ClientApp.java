package in.ineuron.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.CustomerController;
import in.ineuron.vo.CustomerVo;

public class ClientApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the CustomerName :: ");
		String customerName = scanner.next();

		System.out.print("Enter the CustomerAddr :: ");
		String customerAddress = scanner.next();

		System.out.print("Enter the Principal Amount :: ");
		String pamount = scanner.next();

		System.out.print("Enter the Time period :: ");
		String time = scanner.next();

		System.out.print("Enter the Rate of Interest :: ");
		String rate = scanner.next();

		CustomerVo vo = new CustomerVo();
		vo.setCustomerAddress(customerAddress);
		vo.setCustomerName(customerName);
		vo.setPamt(pamount);
		vo.setRate(rate);
		vo.setTime(time);

		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		CustomerController controller = applicationContext.getBean("controller", CustomerController.class);
		System.out.println(controller.processResult(vo));

		applicationContext.close();
		scanner.close();
	}
}

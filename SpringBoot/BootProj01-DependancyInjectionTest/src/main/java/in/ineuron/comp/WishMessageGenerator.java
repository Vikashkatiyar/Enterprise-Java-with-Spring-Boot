package in.ineuron.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
@Scope("prototype")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime date;

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator :: Zero param constructor...");
	}

	// Business Logic
	public String generateWishMessage(String user) {

		System.out.println("WishMessageGenerator.generateWishMessage()");

		int hour = date.getHour();
		if (hour < 12)
			return "Good Morning:: " + user;
		else if (hour < 16)
			return "Good Afternoon:: " + user;
		else if (hour < 20)
			return "Good Evening :: " + user;
		else
			return "Good night :: " + user;
	}
}

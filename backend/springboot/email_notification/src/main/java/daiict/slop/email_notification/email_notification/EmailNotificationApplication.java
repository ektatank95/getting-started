package daiict.slop.email_notification.email_notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan("daiict.slop.email_notification.email_notification")
@SpringBootApplication
//@ComponentScan(basePackageClasses = EmailController.class)
public class EmailNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailNotificationApplication.class, args);
	}

}

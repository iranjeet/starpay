package com.example.STARPAY;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StarpayRanjeetApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarpayRanjeetApplication.class, args);
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<- @StarPay-Server-Started ->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
		System.out.println(" 		+\"\"\"\"\"+ 					");
		System.out.println("	 	[| o o |]			 		" + Calendar.getInstance().getTime());
		System.out.println(" 		|  ^  | 	 				" + new SimpleDateFormat().format(new Date()));
		System.out.println(" 		| '-' | 	 				" + "Starpay @ Anvaya_Analytics_Lab_Private_Limited");
		System.out.println(" 		+-----+ 			 		" + "Port(s): 8888 (HTTP)");
	}

}

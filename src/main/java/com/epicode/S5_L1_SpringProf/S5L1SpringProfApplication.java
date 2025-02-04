package com.epicode.S5_L1_SpringProf;

import com.epicode.S5_L1_SpringProf.Esercizio.Menu;
import com.epicode.S5_L1_SpringProf.configuration.MenuConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class S5L1SpringProfApplication {

	public static void main(String[] args) {
		SpringApplication.run(S5L1SpringProfApplication.class, args);


		//soluzione esercizio
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MenuConfig.class);

		Menu menu = (Menu) appContext.getBean("menu");

		menu.printMenu();

		//chiuso il container
		appContext.close();

	}

}

package com.epicode.S5_L1_SpringProf;

import com.epicode.S5_L1_SpringProf.Esercizio.*;
import com.epicode.S5_L1_SpringProf.services.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class S5L1SpringProfApplicationTests {

//	@Autowired S5L1SpringProfApplication app;
//	@Autowired private OrderService orderService;
//	private static Article article;
//	private static Menu menu;
//	private static Pizza pizza;
//
//	//primo test
//	@Test
//	void contextLoads() {
//		// Verifico che l'applicazione è avviata
//
//
//		assertThat(app).isNotNull();
//	}
//	@Test
//	void myTest(){
//		assert true;
//	}
//	@BeforeEach
//	void beforeEachTest(){
//		System.out.println("BEFORE EACH");
//		menu = orderService.createMenu();
//	    List<Pizza> listsPizza = menu.getPizzaList();
//	    List<Drink> drinkList = menu.getDrinkList();
//		List<Topping> toppingList = menu.getToppingList();
//
//	}
//
//	@Test
//	@Disabled
//	@DisplayName("testSulPrezzoDellaMargherita")
//	void testPricePizzeMargherita(){
//    assertNotEquals(5.99, article.getPrice());
//	}
//	@Test
//	@Disabled
//	@DisplayName("testSulleCalorieDellaMargherita")
//	void testCaloriesMargherita(){
//		assertEquals(1050,article.getCalories());
//	}
//	@ParameterizedTest
//	@CsvSource({"4","3","2","1","5"})
//	void testOrder1(int numCoperti){
//		Order order = orderService.createOrder(3,orderService.createTable());
//		assertTrue(order.getNumCoperti() > numCoperti);
//	}
//	@ParameterizedTest
//	@CsvSource({"1900","1000","1100","1200"})
//	void ricercaCalorieMargherita(int calories){
//         Pizza p1 = new Pizza(1150,5.99,"Margherita");
//
//		assertTrue(p1.getCalories() > calories);
//
//	}
//	@ParameterizedTest
//	@CsvSource({"1","2","3"})
//	void ricercaOrdineX(Table table){
//		Order o1 = orderService.createOrder(10,orderService.createTable());
//
//	}


}

package com.epicode.S5_L1_SpringProf;

import com.epicode.S5_L1_SpringProf.Esercizio.Menu;
import com.epicode.S5_L1_SpringProf.Esercizio.Order;
import com.epicode.S5_L1_SpringProf.Esercizio.Pizza;
import com.epicode.S5_L1_SpringProf.Esercizio.Table;
import com.epicode.S5_L1_SpringProf.services.OrderService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EsercizioSpringTest {

    @Autowired private S5L1SpringProfApplication app;
    @Autowired private OrderService orderService;
    private static List<Pizza> listaPizza;


    @Test
    void contextLoads() {
        // Verifico che l'applicazione è avviata
       assertThat(app).isNotNull();
    }

    @Test
    void testCopertiTavolo(){
      Table t = orderService.createTable();
        assertEquals(4,t.getNumMaxCoperti());
    }

    @Test
    void testPizzaMargherita(){
        Pizza p = orderService.createPizzaMargherita();
        assertNotNull(p);
    }
    @Test
    void testPrezzoPizzaMargherita(){
        Pizza p = orderService.createPizzaMargherita();
        assertEquals(4.99, p.getPrice());
    }

    @Test
    void testDisponibilitaTavolo(){
        Table t = orderService.createTable();
        assertTrue(t.isStato());
    }

    @Test
    void testMenu(){
        Menu m = orderService.createMenu();
        assertEquals(7,m.getMenuList().size());
    }
    @Test
    void testOrdine(){
        Table t1 = orderService.createTable1();
        Order o = orderService.createOrder(2,t1);
       assertNotNull(o);
    }
    @Test
    void testTotalOrder(){
        Table t1 = orderService.createTable1();
        Order o = orderService.createOrder(2,t1);
        o.aggiungiProdotti(orderService.createPizzaMargherita());
        o.aggiungiProdotti(orderService.createPizzaSalami());
        assertEquals(13.98,o.totaleOrdine());
    }

//    @BeforeEach
//    void popolaPizze(){
//        listaPizza.add(orderService.createPizzaMargherita());
//        listaPizza.add(orderService.createPizzaSalami());
//
//    }


    @ParameterizedTest
    @CsvSource({"Pizza Margherita, 4.99", "Salami Pizza, 5.99"})
    void testParamPizza(String nomePizza, double prezzo){
        Pizza p = null;
      for (Pizza pizza : listaPizza){
          if(pizza.getName().equals(nomePizza)){
              p = pizza;
          }

        }
      assertEquals(prezzo,p.getPrice());
    }


}

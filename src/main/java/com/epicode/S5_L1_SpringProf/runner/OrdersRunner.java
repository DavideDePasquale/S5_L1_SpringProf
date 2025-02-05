package com.epicode.S5_L1_SpringProf.runner;
import com.epicode.S5_L1_SpringProf.Esercizio.*;
import com.epicode.S5_L1_SpringProf.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class OrdersRunner implements CommandLineRunner {

   @Autowired
   private OrderService ordersService;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("OrdersRunner....");

        //soluzione esercizio

        Menu menu = ordersService.createMenu();
//        menu.printMenu();
        Table t1 = ordersService.createTable();
//        System.out.println(t1);
        Table t2 = ordersService.createTable1();
//        System.out.println(t2);
        Table t3 = ordersService.createTable2();
//        System.out.println(t3);


        Order o1 = ordersService.createOrder(4,t1);
        o1.aggiungiProdotti(ordersService.createPizzaMargherita());
        o1.aggiungiProdotti(ordersService.createPizzaMargherita());
//        o1.stampaOrdine();



    }
}

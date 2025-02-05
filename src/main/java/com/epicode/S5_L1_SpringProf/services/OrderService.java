package com.epicode.S5_L1_SpringProf.services;

import com.epicode.S5_L1_SpringProf.Esercizio.*;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired @Qualifier("menu") ObjectProvider<Menu> menuProvider; // mi leggo il bean chiamato menu, lo istanzio e lo metto all'interno di un application Context. Inietta l'istanza di tipo Menu. i sarà un contenitore con all'interno un oggetto di tipo Menu.
    @Autowired @Qualifier("tavolo") ObjectProvider<Table> tableProvider;
    @Autowired @Qualifier("tavolo1") ObjectProvider<Table> table1Provider;
    @Autowired @Qualifier("order1") ObjectProvider<Order> orderProvider;
    @Autowired @Qualifier("pizza_margherita") ObjectProvider<Pizza> pizza_margheritaProvider;
    @Autowired @Qualifier("pizza_salami") ObjectProvider<Pizza> pizza_salamiProvider;
    @Autowired @Qualifier("tavolo2") ObjectProvider<Table> table2Provider;



    public Pizza createPizzaMargherita(){
        return  pizza_margheritaProvider.getObject();
    }
    public Pizza createPizzaSalami(){
        return pizza_salamiProvider.getObject();
    }


    //Creazione metodo che prende l'application context con l'oggetto Menu e mi restituisce solo l'oggetto.
    public Menu createMenu(){
        return  menuProvider.getObject();
    }
    public Table createTable(){
        return tableProvider.getObject();
    }
    public Table createTable1(){
        return table1Provider.getObject();
    }
    public Table createTable2(){
        return table2Provider.getObject();
    }

    public Order createOrder(int numCoperti, Table tavolo){
        Order o = orderProvider.getObject();
        o.setTavolo(tavolo);
        o.setNumCoperti(numCoperti);
        return o;
    }





}

package com.epicode.S5_L1_SpringProf.runner;

import com.epicode.S5_L1_SpringProf.Esercizio.Article;
import com.epicode.S5_L1_SpringProf.Esercizio.Ordine;
import com.epicode.S5_L1_SpringProf.Esercizio.Tavolo;
import com.epicode.S5_L1_SpringProf.Esercizio.Topping;
import com.epicode.S5_L1_SpringProf.enumeration.StatoOrdine;
import com.epicode.S5_L1_SpringProf.enumeration.StatoTavolo;
import com.epicode.S5_L1_SpringProf.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class orderRunner implements CommandLineRunner {

    List<Ordine> listaOrdini = new ArrayList<Ordine>();
    List<Article> articleListOrder = new ArrayList<Article>();



    @Autowired private OrderService orderService;
    @Override
    public void run(String... args) throws Exception {



        Tavolo t = orderService.createTavolo();
        t.setNumero_tavolo_id(1);
        t.setNumero_coperti(4);
        t.setStato_tavolo(StatoTavolo.OCCUPATO);
        System.out.println(t);


      Ordine o = orderService.createOrdine();
      o.setNumero_ordine_id(1);
      o.setTavolo(t);
      o.setN_coperti(4);
      o.setStatoOrdine(StatoOrdine.PRONTO);

        System.out.println(o);





    }
}

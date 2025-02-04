package com.epicode.S5_L1_SpringProf.services;

import com.epicode.S5_L1_SpringProf.Esercizio.Ordine;
import com.epicode.S5_L1_SpringProf.Esercizio.Tavolo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    @Qualifier("creationOrder")
    ObjectProvider<Ordine> ordineObjectProvider;
    @Autowired
    @Qualifier("creationTable")
    ObjectProvider<Tavolo> tavoloObjectProvider;


    public Tavolo createTavolo(){
        return  tavoloObjectProvider.getObject();
    }


    public Ordine createOrdine(){
        return ordineObjectProvider.getObject();
    }


}

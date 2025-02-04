package com.epicode.S5_L1_SpringProf.Esercizio;

import com.epicode.S5_L1_SpringProf.enumeration.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
@Data
public class Ordine {

    private int numero_ordine_id;
    private Tavolo tavolo;
    private List<Article> listaOrdine;
    private StatoOrdine statoOrdine;
    private int n_coperti;
    private double totale;
    @Value("${ordine.coperto}")
    private double coperto;




    public Ordine(int numero_ordine_id, Tavolo tavolo, List<Article> listaOrdine, StatoOrdine statoOrdine, int n_coperti) {
        this.numero_ordine_id = numero_ordine_id;
        this.tavolo = tavolo;
        this.listaOrdine = listaOrdine;
        this.statoOrdine = statoOrdine;
        this.n_coperti = n_coperti;
        this.totale = calcolaTotale();
    }
    private double calcolaTotaleArticoliNellOrdine(){
        return listaOrdine.stream().mapToDouble(Article::getPrice).sum();
    }
    private double calcolaTotale(){
        double costoMenu = calcolaTotaleArticoliNellOrdine();
        double costoCoperti = coperto * n_coperti;
        return costoMenu + costoCoperti;

    }

}
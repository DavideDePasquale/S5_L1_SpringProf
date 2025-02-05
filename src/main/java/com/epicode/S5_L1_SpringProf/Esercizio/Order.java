package com.epicode.S5_L1_SpringProf.Esercizio;

import com.epicode.S5_L1_SpringProf.enumeration.Stato;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



@AllArgsConstructor
@Data
@Builder
public class Order {

    private static int count = 1;
    private int numeroOrdine;
    private Stato stato;
    private int numCoperti;
    private LocalTime oraAcquisizione;
    private List<Article> listaProdotti;
    private Table tavolo;
    @Value("${menu.coperto}")
    private double costoCoperto;

    public Order(int numCoperti, Table tavolo) {
        this.numeroOrdine = count++;
        this.stato = Stato.IN_CORSO;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = LocalTime.now();
        this.listaProdotti = new ArrayList<Article>();
        this.tavolo = tavolo;

    }

    public Order() {
        this.numeroOrdine = count++;
        this.stato =Stato.IN_CORSO;
        this.oraAcquisizione = LocalTime.now();
        this.listaProdotti = new ArrayList<Article>();
    }

    public void aggiungiProdotti(Article prodotto){
       this.listaProdotti.add(prodotto);
   }

   public double totaleOrdine(){
       return this.listaProdotti.stream().mapToDouble(Article::getPrice).sum() + (this.costoCoperto + this.numCoperti);
   }

   public void stampaOrdine(){
       System.out.println("Ordine : " + this.numeroOrdine);
       System.out.println("Stato : " + this.stato);
       System.out.println("Numero di coperti : " + this.numCoperti);
       System.out.println("Ora : " + this.oraAcquisizione);
       System.out.println("Lista prodotti : " + this.listaProdotti.size());
       this.listaProdotti.forEach(ele -> {
           if (ele instanceof Pizza){
               Pizza p = (Pizza) ele;
               System.out.println(p);
           }
           if( ele instanceof Drink){
               Drink d = (Drink) ele;
               System.out.println(d);
           }
       });

   }

}
package com.epicode.S5_L1_SpringProf.configuration;

import com.epicode.S5_L1_SpringProf.Esercizio.Article;
import com.epicode.S5_L1_SpringProf.Esercizio.Ordine;
import com.epicode.S5_L1_SpringProf.Esercizio.Tavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OrderConfig {


    @Bean(name = "creationArticle")
    public Article article(){
        return new Article();
    }

    @Bean(name = "creationOrder")
    public Ordine order(){
        return new Ordine();
    }
    @Bean(name = "creationTable")
    public Tavolo tavolo(){
        return new Tavolo();
    }


}

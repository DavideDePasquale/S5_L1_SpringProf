package com.epicode.S5_L1_SpringProf.Esercizio;

import com.epicode.S5_L1_SpringProf.enumeration.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tavolo {

    private int numero_tavolo_id;
    private int numero_coperti;
    private StatoTavolo stato_tavolo;



}

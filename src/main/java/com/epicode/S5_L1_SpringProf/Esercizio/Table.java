package com.epicode.S5_L1_SpringProf.Esercizio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Table {

    private int numTable;
    private int numMaxCoperti;
    private boolean stato;

}

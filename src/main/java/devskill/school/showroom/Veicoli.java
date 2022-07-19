package devskill.school.showroom;

import lombok.*;

import java.util.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Veicoli {
    private String nome;
    private String marca;
    private int annoProduzione;
    private double prezzo;



    public void aggiungiMoto(Motocicli nuovaMoto){
    motocicli.add(nuovaMoto);
    }

    public abstract String getTipo();

}

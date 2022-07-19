 package devskill.school.alternative;

import lombok.*;

import java.util.List;

 @Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Veicoli implements Alternative {
     private String nome;
     private String marca;
     private int annoProduzione;
     private double prezzo;

     private List<Veicoli> veicoli;

     public abstract String getTipo();

     public Veicoli oldVehicle() {
         Veicoli ritornaVeicolo = null;
         int old = veicoli.get(0).getAnnoProduzione();
         for (int i = 0; i < veicoli.size(); i++) {
             int annoInCorso = veicoli.get(i).getAnnoProduzione();

             if (annoInCorso < old) {
                 old = annoInCorso;
                 ritornaVeicolo = veicoli.get(i);
             }
         }
         return ritornaVeicolo == null ? veicoli.get(0) : ritornaVeicolo;
     }

     public Veicoli newVehicle() {
         Veicoli ritornaVeicolo = null;
         int nuovo = veicoli.get(0).getAnnoProduzione();
         for (int i = 0; i < veicoli.size(); i++) {
             int annoInCorso = veicoli.get(i).getAnnoProduzione();

             if (annoInCorso > nuovo) {
                 nuovo = annoInCorso;
                 ritornaVeicolo = veicoli.get(i);
             }
         }
         return ritornaVeicolo == null ? veicoli.get(0) : ritornaVeicolo;
     }

     public double calcolo() {
         double totalePrezzi = 0;
         int totaleVeicoli = 0;

         for (Veicoli veicolo : veicoli) {
             if (veicoli.getClass().equals(Veicoli.class)) {
                 totalePrezzi += veicolo.getPrezzo();
                 totaleVeicoli++;
             }

         }

         return totaleVeicoli == 0 ? 0 : totalePrezzi / totaleVeicoli;

     }
 }




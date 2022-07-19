package devskill.school.showroom;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter
@Setter
public class Showroom {
    private List<Veicoli> veicoli;

    public Showroom() {
        veicoli = new ArrayList<>();
    }

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

    public double mediaPrice() {
        double tot = 0;

        for (int i = 0; i < veicoli.size(); i++) {
            tot += veicoli.get(i).getPrezzo();
        }
        return tot / veicoli.size();
    }

    public double calcolo() {
        for (Veicoli veicolo : veicoli) {
            if (veicoli.getClass().equals(Veicoli.class)) {

            }
        }


        // Veicoli veicoli = new Veicoli();
        // Automobili automobili = new Automobili("A1", "Audi", 2001, 10000, 1400);

        //   motocicli.getAnnoProduzione();
        // automobili.getAnnoProduzione();

        // Motocicli veicoli = new Motocicli("Ninja", "Yamaha",2008, 3500,false,true);
        // HashSet<Motocicli> veicoli = new HashSet<>();
        // veicoli.add(new Motocicli("Ninja", "Kawasaki", 2008, 3500, false, true));
        // veicoli.add(new Motocicli("RSV100", "Aprilia", 2010, 5000, true, true));

        // Veicoli motocicli = new Veicoli();

        // System.out.println(veicoli.getAnnoProduzione());

        // Motocicli veicoli = new Motocicli("RSV100", "Aprilia",2010, 5000,true,true);


    }
}



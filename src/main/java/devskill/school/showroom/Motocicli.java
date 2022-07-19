package devskill.school.showroom;

import devskill.school.showroom.utility.ShowRoomUtility;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class Motocicli extends Veicoli{

    private boolean isLimitedEdition= false;
    private boolean isRacing = false;

    public Motocicli(String nome, String marca, int annoProd, double prezzo, boolean isRacing, boolean isLimitedEdition) {
        super(nome, marca, annoProd, prezzo);
        this.isRacing = isRacing;
        this.isLimitedEdition = isLimitedEdition;
    }
    public Motocicli(String nome, String marca, int annoProd, double prezzo) {
        super(nome, marca, annoProd, prezzo);
    }

    @Override
    public String getTipo() {
        return ShowRoomUtility.TIPO_MOTOCICLO;
    }
}

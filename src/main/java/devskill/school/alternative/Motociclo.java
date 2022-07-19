package devskill.school.alternative;

import devskill.school.showroom.Veicoli;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Motociclo extends Veicoli {
    private boolean isLimitedEdition= false;
    private boolean isRacing = false;

    public Motociclo(String nome, String marca, int annoProd, double prezzo, boolean isRacing, boolean isLimitedEdition) {
        super(nome, marca, annoProd, prezzo);
        this.isRacing = isRacing;
        this.isLimitedEdition = isLimitedEdition;
    }
    public Motociclo(String nome, String marca, int annoProd, double prezzo) {
        super(nome, marca, annoProd, prezzo);
    }

    @Override
    public String getTipo() {
        return ShowRoomUtility.TIPO_MOTOCICLO;
    }
}

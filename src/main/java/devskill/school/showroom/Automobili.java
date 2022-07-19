package devskill.school.showroom;

import devskill.school.showroom.utility.ShowRoomUtility;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Automobili extends Veicoli {
    private Integer cilindrata;

    public Automobili(String nome, String marca, Integer annoProduzione, Integer prezzo, Set<Motocicli> motocicli, Set<Automobili> automobili, Integer cilindrata) {
        super(nome, marca, annoProduzione, prezzo, motocicli, automobili);
        this.cilindrata = cilindrata;
    }

    @Override
    public String getTipo() {
        return ShowRoomUtility.TIPO_AUTOMOBILE;
    }
}

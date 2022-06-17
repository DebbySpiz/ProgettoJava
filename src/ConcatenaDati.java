import java.util.Scanner;

public class ConcatenaDati {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome : ");
        String nome = sc.nextLine();
        System.out.println("Inserisci il tuo cognome : ");
        String cognome = sc.nextLine();
        System.out.println("Inserisci il tuo sesso : ");
        String sesso = sc.nextLine();
        System.out.println("Inserisci la tua eta' : ");
        String eta = sc.nextLine();
        System.out.println(nome + " " + cognome + " " + sesso + " " + eta);
    }
}

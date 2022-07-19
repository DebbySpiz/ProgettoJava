package devskill.school.main;

import devskill.school.utility.Calcolatrice;

import java.util.Scanner;

public class ArithmeticalOperation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Calcolatrice calcola = new Calcolatrice();
        System.out.println("Inserisci il primo numero : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Inserisci il secondo numero : ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(calcola.addizione(a,b));
        System.out.println(calcola.sottrazione(a,b));
        System.out.println(calcola.moltiplicazione(a,b));
        System.out.println(calcola.divisione(a,b));
    }

 /*   private static void calcola(int a, int b) {
        int addizione,sottrazione,moltiplicazione;
        float divisione;
        addizione=a+b;
        sottrazione=a-b;
        moltiplicazione=a*b;
        divisione=(float)a/b;
        System.out.println("Il risultato dell'addizzione :  "+addizione);
        System.out.println("Il risultato della sottrazione : "+sottrazione);
        System.out.println("Il risultato della moltiplicazione "+moltiplicazione);
        System.out.println("Il risultato della divisione "+ divisione);
    }*/

}

package devskill.school.utility;

import java.util.Scanner;

public class Grades {
    private double Celsius;
    private double Fahrenhait;
    private double Kilometers;
    private double Miles;
    Scanner sc = new Scanner(System.in);

    public Double Celsius() {
        int input = sc.nextInt();
        return (input - 32) * (double) 5 / 9;
    }

    public Double Fahrenhait() {
        int input = sc.nextInt();
        return input * (double) 9 / 5 + 32;
    }

    public double Kilometers() {
        int input = sc.nextInt();
        return input * 1.609;
    }

    public double Miles() {
        int input = sc.nextInt();
        return input / 1.609;
    }

    public void scelta() {
        System.out.println("1 - Converti in Celsius");
        System.out.println("2 - Converti in Fahrenhait");
        System.out.println("3 - Converti in Kilometers");
        System.out.println("4 - Converti in Miles");
    }

    public double selezione(int a) {
        System.out.println("Inserisci il numero");
    /*    if (a == 1) {
            return Celsius();
        } else if (a == 2) {
            return Fahrenhait();
        } else if (a == 3) {
            return Kilometers();
        } else{
            return Miles();

        }*/

        switch (a) {
            case 1:
                return Celsius();

            case 2:
                return Fahrenhait();

            case 3:
                return Kilometers();

            case 4:
                return Miles();

            default:
                System.out.println("Non valido");
        }

        return 0;
    }

}






/*
      public String scelta(String a, String b){
        if (scelta == a) {
            return Fahrenhait;
        } else return Celsius;
    }*/


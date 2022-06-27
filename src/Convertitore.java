import java.util.Arrays;
import java.util.Scanner;

public class Convertitore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grades grades = new Grades();
        grades.scelta();


            System.out.println("Seleziona in cosa convertire");
            int s = sc.nextInt();
           System.out.println(grades.selezione(s));

        }
    }


   /*     System.out.println("Inserisci la misura:");
        Double a = Double.valueOf(sc.nextLine());
        Double b = Double.valueOf(sc.nextLine());
        Double c = Double.valueOf(sc.nextLine());
        Double d = Double.valueOf(sc.nextLine());


        System.out.println(grades.getCelsius(a));
       System.out.println(grades.getFahrenhait(b));
        System.out.println(grades.getKilometers(c));
        System.out.println(grades.getMiles(d));


    }*/



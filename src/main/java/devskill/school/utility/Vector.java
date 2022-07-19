package devskill.school.utility;

import java.util.ArrayList;

public class Vector {


    /*  static int[] parseNumbers(String s) {                     //IL MIO METODO ALTERNATIVO
          String[] values = s.split(",");
          int[] result = new int[values.length];
          for(int i=0; i<values.length; i++)
              result[i] = Integer.parseInt(values[i]);
          return result;
      }
      public static int[] reorder(int[] array) {
          int[] ordered = new int[array.length];
          for (int i = 0; i < array.length; i++) {
              int greaters = maximum(array, array[i]);
              ordered[array.length - 1 - greaters] = array[i];
          }
          return ordered;
      }
      private static int maximum(int[] array, int n) {
          int cont = 0;
          for(int value : array)
              if(value > n)
                  cont++;
          return cont;
      }
  */
    public static Integer maximum(ArrayList<Integer> array){               //MAX IN UN VETTORE
        Integer max = array.get(0);
        for (int i=0; i< array.size(); i++) {
            Integer currentElement = array.get(i);
            if (currentElement > max) {
                max = currentElement;
            }
        }
        return max;
    }




    // Concatenazione array
    public static ArrayList<Integer> terzoArray(ArrayList<Integer> array1, ArrayList<Integer> array2){
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.addAll(array1);
        array3.addAll(array2);

        return array3;

    }

}

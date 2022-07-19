package devskill.school.main.Vector;

import devskill.school.utility.Vector;

import java.util.ArrayList;
import java.util.Arrays;


public class Array {
   public static void main (String[] args){

      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3,6,2,64,357,8,1));
       ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(6,3,7,2,8,10));
       ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1,7,5,11,15,4));

       System.out.println(Vector.maximum(array));
       System.out.println(Vector.terzoArray(array1,array2));
    }
 /* public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter numbers (comma-separated):");
      String a = sc.nextLine();
      int[] values = Vector.parseNumbers(a);
      int[] ordered = Vector.reorder(values);
      for(int value : ordered)
          System.out.println(value);
  }*/


}

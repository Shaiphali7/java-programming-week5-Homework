package java_programming_hw_week5;

import java.util.ArrayList;
import java.util.Scanner;

//7. Write a Java program to test if an array list is empty or not
public class Programme_7_ArrayListEmpty {
    public static void main(String[] args) {
        //Defining the ArrayList
        ArrayList<Integer> value = new ArrayList<>();
        System.out.println("Please enter integer numbers and for exit enter 0");
        Scanner scanner=new Scanner(System.in);
        while(scanner.nextInt()>0)
        {
            value.add(scanner.nextInt());
        }
        System.out.println("Values of ArrayList are: " + value);
        System.out.println("Is arrayList is empty? return true if it empty :" + value.isEmpty());
        value.removeAll(value);
        System.out.println("ArrayList after removing all element" + value);
        System.out.println("Is arrayList is empty? return true if it empty :" + value.isEmpty());

    }
}

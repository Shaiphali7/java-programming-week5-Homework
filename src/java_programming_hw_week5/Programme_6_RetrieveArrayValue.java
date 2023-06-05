package java_programming_hw_week5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveArrayValue
{
    public static void main(String[] args) {
        //Defining the Arraylist
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Red");
        list1.add("White");
        list1.add("Black");
        list1.add("Orange");
        list1.add("Blue");
        list1.add("Yellow");
        list1.add("Pink");
        //Getting the specified value
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number between 0-6 to get value from list");
        int num=scanner.nextInt();
        System.out.println("Arraylist is :"+list1);
        System.out.println(num+"th element of ArrayList is: "+list1.get(num));


    }
}

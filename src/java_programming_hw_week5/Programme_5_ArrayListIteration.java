package java_programming_hw_week5;

import java.util.ArrayList;
import java.util.Iterator;

/*
5. Write a Java program to iterate through all elements in an array list using
Iterater.
 */
public class Programme_5_ArrayListIteration
{
    public static void main(String[] args) {
//Defining the array list
        ArrayList arrayList=new ArrayList<>();
        arrayList.add("One");
        arrayList.add(20);
        arrayList.add("Two");
        arrayList.add(20.10);
        arrayList.add('A');
        arrayList.add("Today is Monday");
        //Using iterator to print value
        Iterator iterator1=arrayList.iterator();
        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }


    }
}

package java_programming_hw_week5;

import java.util.ArrayList;

/*
4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.

 */
public class Programme_4_ArraylistCreation
{
    public static void main(String[] args)
    {
//ArrayList for String object
        ArrayList<String> list =new ArrayList<>();
    list.add("Red");
    list.add("Blue");
    list.add("Yellow");
    list.add("White");
    list.add("Black");
    list.add("Red");
    list.add("Purple");
    list.add("Pink");
    //Printing the object using for loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}

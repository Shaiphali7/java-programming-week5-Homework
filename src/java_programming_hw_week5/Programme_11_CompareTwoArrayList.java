package java_programming_hw_week5;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */
public class Programme_11_CompareTwoArrayList
{
    public static void main(String[] args) {
        //Declaring the two arraylist c1 and c2
        ArrayList<String> c1=new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("pink");
        ArrayList<String> c2=new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        boolean equal=c1.equals(c2);
        System.out.println("Both the Arraylist are equals if return is true :"+equal);

    }
}

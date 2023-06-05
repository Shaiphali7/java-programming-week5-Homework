package java_programming_hw_week5;
/*
3. Write a Java program to reverse an array of integer values.
 */
import java.util.Arrays;

public class Programme_3_ReverseArray
{
    public static void main(String[] args) {
        int []arr={1789,2035,1899,1456,2013,2458,1472,2365,1456,2165,1457,2453};
        System.out.println("Original array: "+ Arrays.toString(arr));
        for(int i=0;i< arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }
        System.out.println("Reverse array :"+Arrays.toString(arr));


    }

}

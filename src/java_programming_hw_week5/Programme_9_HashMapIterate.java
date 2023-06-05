package java_programming_hw_week5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMapIterate
{
    public static void main(String[] args) {
        //Declaring HashMap with string key and integer value
        Map<String,Integer> empSalary=new HashMap<>();
        empSalary.put("John",2500);
        empSalary.put("Ram",2490);
        empSalary.put("Shyam",2800);
        empSalary.put("Maria",2600);
        empSalary.put("Geeta",2900);
        Iterator<Map.Entry<String,Integer>>empIterator=empSalary.entrySet().iterator();
        while(empIterator.hasNext())
        {
            System.out.println("Element of HashMap empSalary are : "+empIterator.next());
        }

    }

}

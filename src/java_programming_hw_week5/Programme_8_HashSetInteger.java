package java_programming_hw_week5;
//8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
//else)
import java.util.HashSet;

public class Programme_8_HashSetInteger
{
    public static void main(String[] args) {
        HashSet<Integer> setValue=new HashSet<>();
        setValue.add(4);
        setValue.add(7);
        setValue.add(8);
        setValue.add(11);
        for(int i=0;i<=10;i++)
        {
            if(setValue.contains(i))
            {
                System.out.println(i+" value is in HashSet");
            }
            else
            {
                System.out.println(i+" value is not in HashSet");
            }
        }
    }
}

package calculate;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
       char c1;
       Calculator obj=new Calculator();
       //Declaration of scanner
        Scanner scanner=new Scanner(System.in);
       do {
           System.out.println("Enter first number");
           int a = scanner.nextInt();
           System.out.println("Enter second number");
           int b = scanner.nextInt();
           System.out.println("Please enter one symbol +,-,*,/");
           char symbol = scanner.next().charAt(0);
           obj.calculateResult(a,b,symbol);
           System.out.println("Please enter Y or N");
            c1=scanner.next().charAt(0);

       }while(c1=='Y' || c1=='y');
       }
}

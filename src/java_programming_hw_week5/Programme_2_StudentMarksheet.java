package java_programming_hw_week5;

import java.util.Scanner;

/**
 * * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * * _______________________________
 * * | |
 * * | Mark Sheet |
 * * |_______________________________|
 * * | Name : Jay |
 * * | Roll No: 08 |
 * * |_______________________________|
 * * | Subjects : Marks |
 * * |_______________________________|
 * * | Math : 98 |
 * * | Science : 90 |
 * * | English : 85 |
 * * |_______________________________|
 * * | Total : 273 |
 * * |_______________________________|
 * * | Percentage : 91.0 |
 * * | Result : Pass |
 * * | Grade : A+ |
 * * |_______________________________|
 */
public class Programme_2_StudentMarksheet {
    public static void main(String[] args) {
        //Scanner decalartion for input from console
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = s.next();
        System.out.println("Enter student Roll number");
        int rollNum = s.nextInt();
        System.out.println("Enter Marks of Maths subject");
        int mathsMarks = s.nextInt();
        boolean m1 = checkMarks(mathsMarks);
        System.out.println("Enter Marks of science subject ");
        int scienceMarks = s.nextInt();
        boolean s1 = checkMarks(scienceMarks);
        System.out.println("Enter Marks of English subject");
        int englishMarks = s.nextInt();
        boolean e1 = checkMarks(englishMarks);
        if (m1 == false) {
            System.out.println("Invalid marks please enter again");
            mathsMarks = s.nextInt();
        }
        if (s1 == false) {
            System.out.println("Invalid marks please enter again");
            scienceMarks = s.nextInt();
        }
        if (e1 == false) {
            System.out.println("Invalid marks please enter again");
            englishMarks = s.nextInt();
        }
        int sum = total(mathsMarks, scienceMarks, englishMarks);
        int percentage = (sum * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, mathsMarks);
        String grade = calulateGrade(percentage, result);
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "             |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + sum + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "     |");
        System.out.println("| Result:" + result + "             |");
        System.out.println("| Grade:" + grade + "               |");
        System.out.println("|___________________________|");

    }

    public static boolean checkMarks(int marks) {

        if (marks > 0 || marks < 100) {
            return true;
        } else return false;
    }

    public static int total(int marks1, int marks2, int marks3) {
        return (marks1 + marks2 + marks3);
    }

    public static String calculateResult(int marks1, int marks2, int marks3) {
        if (marks1 < 35 || marks2 < 35 || marks3 < 35) {
            return "Fail";
        } else {
            return "Pass";
        }

    }

    public static String calulateGrade(int percentage, String result) {
        String grade;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "-";
            }
        }
        return "null";

    }
}

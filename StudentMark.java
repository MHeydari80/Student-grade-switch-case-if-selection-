package studentmark;

import java.util.Scanner;

public class StudentMark {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your final mark ...");
        double mark = input.nextDouble();
        char markSign = 'a';

//        if-else statement
        if (mark >= 0 && mark < 10) {
            System.out.println(markSign);

        } else if (mark > 9 && mark <= 11) {
            System.out.println(++markSign);

        } else if (mark > 11 && mark <= 13) {
            System.out.println((char) (2 + markSign));

        } else if (mark > 13 && mark <= 17) {
            System.out.println((char) (3 + markSign));

        } else if (mark > 17 && mark <= 20) {
            System.out.println((char) (4 + markSign));
        } else {

            System.out.println("Invalid number");
        }

//        Switch-case statement

        /* switch ((int) markSign) {

         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         System.out.println(markSign);

         case 10:
         case 11:
         System.out.println(++markSign);

         case 12:
         case 13:
         System.out.println((char) (2 + markSign));

         case 14:
         case 15:
         case 16:
         case 17:
         System.out.println((char) (3 + markSign));

         case 18:
         case 19:
         case 20:
         System.out.println((char) (4 + markSign));

         default:
         System.out.println("Your input number is out of Range !!!");

         }
         */
    }

}

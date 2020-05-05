package es.Weissman.p0Exercices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// exercise 1 - write hello and name in second line
        // System.out.println("Hola Petardilla\nAdios petardilla!!");
    // exercise 2 - write A + B numbers in second line "expected outout" and in third line the result
/*        int A,B;
        A= 74;
        B= 36;
        System.out.println(A + " + " +B);
        System.out.println("Expected output:");
        System.out.println(A+B);*/
    // Exercise 3 - divide two numbers and show result
//        int A,B;
//        A=50;
//        B=3;
//        System.out.println(A + "/" +B);
//        System.out.println("Expected output:");
//        System.out.println((A/B));
    /*4. Write a Java program to print the result of the following operations
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13 */
   /*     int A=-5,B=8,C=6;
        System.out.println(A + " + "+ B + " * "+ C);
        int E=55,D=9;
        System.out.println("(" + E+ "+"+D+") % "+D);
        int F=20, G=-3, H=5, I=8;
        System.out.println(String.format("%d + %d*%d / %d",F,G,H,I));
        int J=5,K=15,L=3,M=2,N=8,O=3;
        System.out.println(String.format("%d + %d / %d * %d - %d %% %d",J,K,L,M,N,O));
        System.out.println("Expected output:");
        System.out.println(A+B*C);
        System.out.println((E+D)%D);
        System.out.println(F+G*H/I);
        System.out.println(J +K / L * M - N %O);
*/
        /*
        5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
         */
/*        int A=25, B=5;
        System.out.println(String.format("Input first number: %d", A));
        System.out.println(String.format("Input second number: %d", B));
        System.out.println("Expected output:");
        System.out.println(String.format("%d x %d = %d",A,B,A*B));*/
        /*
        6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
         */
        /*Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int A = in.nextInt();
        System.out.print("Input second number: ");
        int B = in.nextInt();
        System.out.println("Expected output:");
        System.out.println(String.format("%d + %d = %d",A,B,A+B));
        System.out.println(String.format("%d - %d = %d",A,B,A-B));
        System.out.println(String.format("%d x %d = %d",A,B,A*B));
        System.out.println(String.format("%d / %d = %d",A,B,A/B));
        System.out.println(String.format("%d mod %d = %d",A,B,A%B));
*/
       /* 7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80*/
        /*Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int A = in.nextInt();
        for(int i=1;i<=10; i++){
            System.out.println(String.format("%d x %d = %d",A,i,A*i));*/
        /*
        8. Write a Java program to display the following pattern. Go to the editor
            Sample Pattern :

               J    a   v     v  a
               J   a a   v   v  a a
            J  J  aaaaa   V V  aaaaa
             JJ  a     a   V  a     a
         */
        /*System.out.println("    J    a   v     v  a   ");
        System.out.println("    J   a a   v   v  a a  ");
        System.out.println(" J  J  aaaaa   V V  aaaaa ");
        System.out.println("  JJ  a     a   V  a     a");*/
        /*
        11. Write a Java program to print the area and perimeter of a circle. Go to the editor
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Radius number: ");
        double   A = in.nextFloat();
        System.out.println(String.format("Perimeter is = %.15f",2*Math.PI*A));
        System.out.println(String.format("Area is = %.15f",Math.PI*A*A));

    }
}

package es.Weissman.p0Exercices;

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
        int A=-5,B=8,C=6;
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

    }
}

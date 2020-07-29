import java.util.Scanner;

public class TriangleMaker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int triangle;
        System.out.println("Enter your triangle number please.");
        triangle = scan.nextInt();

        int a,b;

        triangle++;

        for (a = 0; a < triangle ;a++){

            for (b = a;b > 0;b--)
                System.out.print("*");

            System.out.println();

        }

    }

}

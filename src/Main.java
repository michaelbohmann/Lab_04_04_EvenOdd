import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int numToExamine = 0;
        int determinant;

        System.out.print("Choose a number [int]: ");
        numToExamine = console.nextInt();

        determinant = numToExamine % 2;

        if (determinant == 0)
        {
            System.out.println("The number is even");
        }
        else if (determinant == 1) {
            ;
            System.out.println("The number is odd");
        }




    }
}
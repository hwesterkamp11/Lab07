import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        boolean triple = false;
        boolean cancel = false;
        boolean finite = false;
        int roll = 0;
        int sum;
        do {
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("------------------------------------");
            do {
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                roll = roll + 1;
                sum = die1 + die2 + die3;
                System.out.printf("%-6d%-6d%-6d%-6d%-6d%n", roll, die1, die2, die3, sum);
                if (die1 == die2 && die2 == die3) {
                    triple = true;
                }
            } while (!triple);
            triple = false;
            do {
                System.out.println("Continue? Y/N");
                String again = scan.nextLine();
                if(again.equalsIgnoreCase("Y")) {
                    finite = true;
                } else if(again.equalsIgnoreCase("N")) {
                    finite = true;
                    cancel = true;
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                    System.out.println("");
                }
            } while(!finite);
            finite = false;
        } while(!cancel);
        System.out.println("");
    }
}

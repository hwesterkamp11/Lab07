import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int count = 1; count <= 5; count++) {
            for(int next = 1; next <= count; next++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

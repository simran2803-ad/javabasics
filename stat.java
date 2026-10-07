import java.util.Scanner;

public class stat {
    public static void main(String[] args) {

        // Conditional statements
        Scanner sc = new Scanner(System.in);

        int cash = sc.nextInt();

        if (cash < 10) {
            System.out.println("Cannot buy anything");
            System.out.println("Get more cash");
        }
        else if (cash > 10 && cash < 40) {
            System.out.println("Can get 1 thing");
        }
        else {
            System.out.println("Can get both");
        }
    }
}

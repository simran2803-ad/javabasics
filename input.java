import java.util.Scanner;
public class input {
    public static void main(String[] args){
        // How to take input?
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input your age :");
        int age = sc.nextInt();
        System.out.println(age);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // sc.next is only for one token i.e, one word and sc.nextline is fpr one sentence.
        System.out.println(name);
    }
}

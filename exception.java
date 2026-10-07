import java.util.Arrays;
public class exception {
    public static void main(String[] args) {
        //TRY-CATCH in exception handling
        int[] marks = {97, 98, 99};
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {
            // do something after catching
        }
        System.out.println("The name is Aman");
    }
}
public class methods {
    public static void printjava(){
        System.out.println("Hello Java");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void  printSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }


    public static void main(String[]args){
        //METHODS
        printjava();
        printjava();
        printjava();

        printName("Akku");
        printName("Aman");

        printSum(1,6);
    }
}

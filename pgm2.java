import java.util.Scanner;

public class pgm2 {

    public static void main(String[] args) {
        System.out.println("Enter the input1 string:");
        Scanner read= new Scanner(System.in);
        String input1 = read.nextLine();
        System.out.println("Enter the input string:");
        read= new Scanner(System.in);
        String input2 = read.nextLine();

        int difference=input2.charAt(0)-input1.charAt(0);
        System.out.println("Input 1: "+input1);
        System.out.println("input 2: "+input2);
        System.out.println("Key used: "+Math.abs(difference));
    }
}

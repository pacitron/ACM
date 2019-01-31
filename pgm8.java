import java.util.Scanner;

public class pgm8 {
    public static void main(String[] args) {
        String input="";
        Scanner read=new Scanner(System.in);
        int n=Integer.parseInt(read.nextLine());
        for(int i=0;i<n;i++){
            input+=read.nextLine();
        }

    }
}

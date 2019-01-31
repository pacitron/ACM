import java.util.Scanner;

public class pgm1 {

    public static void main(String[] args) {
        int count=0;
        String spaces="";
        String input= null;
        while (true) {
            System.out.println("Enter the input string:");
            Scanner read= new Scanner(System.in);
            input = read.nextLine();
            if(input.length()>20 || input.length()<0){
                System.out.println("Invalid input...");
                continue;
            } else {
                break;
            }
        }
        String reverse = new StringBuffer(input).reverse().toString();
        for(int i=0;i<reverse.length();i++){
            for(int j=0;j<count;j++){
                spaces+=" ";
            }
            System.out.println(spaces+reverse.charAt(i));
            count++;
            spaces="";
        }
    }
}

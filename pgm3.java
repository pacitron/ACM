import java.util.Scanner;

public class pgm3 {

    public static void main(String[] args) {
        String[] array;
        while (true) {
            try {
                System.out.println("Enter the input string:");
                Scanner read= new Scanner(System.in);
                String input = read.nextLine();
                array=input.split(" ");
                int length=Integer.parseInt(array[0]);
                if(length<0 || length>50){
                    System.out.println("Enter number between 0 and 50..");
                    continue;
                }
                if(length!=array.length-1){
                    System.out.println("Enter specified number of words...");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again...");
                continue;
            }
        }

        int highlen=0;
        for(String value:array){
            if(value.length()>highlen){
                highlen=value.length();
            }
        }

        String spaces="";
        for(int i=1;i<array.length;i++){
            for(int j=0;j<highlen-array[i].length();j++){
                spaces+=" ";
            }
            String reverse = new StringBuffer(array[i]).reverse().toString();
            System.out.println(spaces+reverse+" "+array[i]);
            spaces="";
        }
    }
}

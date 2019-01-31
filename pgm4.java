import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class pgm4 {

    public static void main(String[] args) {
        System.out.println("Enter file path: ");
        Scanner read=new Scanner(System.in);
        String fileName = read.nextLine();
        String line=null;

        String reverse;
        int count=0;
        try {
            String[] array = new String[0];
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                array[count]=line;
                reverse=new StringBuffer(array[count]).reverse().toString();
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

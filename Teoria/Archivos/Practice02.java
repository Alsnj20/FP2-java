import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        PrintWriter fileOut;
        String text = "Hello, world!";
        try
        {
            System.out.print("Enter filename: ");
            fileOut = new PrintWriter(scan.nextLine());
            fileOut.println(text);
            fileOut.close();
        }
        catch (FileNotFoundException e)
        {
        System.out.println("Error: " + e.getMessage());
        }
    }
}

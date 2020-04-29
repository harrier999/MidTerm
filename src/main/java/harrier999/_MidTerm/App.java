package harrier999._MidTerm;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FileReader reader = new FileReader("midterm.txt");
    	
        Scanner in = new Scanner(reader);
        System.out.print("Enter the keyword you are looking for:");
        Scanner enter = new Scanner(System.in);
       word = enter.next();
        while(in.hasNextLine())) {
        	String oneLine = in.nextLine;
        	if(oneLine.contains(word)) {
        		System.out.println(oneLine);
        	
        	}
        }
        
    }
}

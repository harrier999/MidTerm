package harrier999._MidTerm;

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
        
        while(reader.read()) {
        	String oneLine = in.nextLine;
        	if(oneLine.contains(word)) {
        		System.out.println(oneLine);
        	
        	}
        }
        
    }
}

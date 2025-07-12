//this program is to demonstrate throws keyword 

package Day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws 
{
	// This method declares it might throw an IOException
    static void readFile() throws IOException
    {
        FileReader file = new FileReader("test.txt");  // May throw IOException
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println(fileInput.readLine());
        fileInput.close();
    }
    
    
    public static void main(String[] args) 
    {
        try 
        {
            readFile(); // Handle the exception here
        } 
        catch (IOException e)
        {
            System.out.println("File not found or error reading file!");
        }
    }

}

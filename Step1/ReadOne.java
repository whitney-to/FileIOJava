import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadOne
{
    public static void main(String[] args)
    {
        /* We must use a try/catch when reading 
         * in a file in case the file is not found
         */
        try {
            // Create the Scanner object using the file
            // as input
            Scanner fileIn = new Scanner(new File(Paths.get("Step1/input.txt").toUri()));
            /* Loop while the file still has lines.
             * .hasNext() looks to see if a line exists
             * but it doesn't read the line.
             */
            while (fileIn.hasNext()) {
                // Reads the entire line
                String lineIn = fileIn.nextLine();
                // Output the line
                System.out.println(lineIn);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }
}
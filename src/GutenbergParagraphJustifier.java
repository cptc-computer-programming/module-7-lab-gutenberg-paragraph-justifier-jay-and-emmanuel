import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class GutenbergParagraphJustifier {
public static final int TAB_SIZE = 4;

    public static void main(String[] args) throws FileNotFoundException {
        // SET UP
        Scanner console = new Scanner(System.in);
        File f; 
        do {
            System.out.println("Enter the path to your input file.");
            String filename = console.next();
            f = new File(filename);
            if (!f.canRead()) {
                System.out.println("Please enter a valid filename.");
            }
        } while (!f.canRead());
    
        // create scanners
        Scanner input = new Scanner(f);

        // create output stream
        PrintWriter output = new PrintWriter(new File("data\\output\\justified.txt"));

        // process
        justifyParagraphs(input, output);

        // close scanners
        console.close();
    }

    // Reads the input text and writes a "justified" version:
    // - trims every line
    // - collapses multiple blank lines into ONE blank line
    // - indents every nonblank line by TAB_SIZE spaces
    public static void justifyParagraphs(Scanner input, PrintWriter out) {
        String tab = spaces(TAB_SIZE);
        while (input.hasNextLine()) {
            String line = input.nextLine().trim();

            out.print(tab); // Indents the line
            out.println(line); // Prints line
        }
    }

    // Prompts until a readable file name is provided, then returns a Scanner on it.
    public static Scanner getInputFileScanner(Scanner console) throws FileNotFoundException {
        return new Scanner(System.in);
    }

    // Returns a string of n spaces (no tabs).
    public static String spaces(int n) {
        String tab = "";
        for (int i = 0; i < n; i++) {
            tab += " ";
        }
        return tab;
    }
}
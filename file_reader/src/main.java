import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        String output = textReader();
        System.out.println(output);
    }

    public static String textReader() throws FileNotFoundException {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\vihan\\Desktop\\myWork\\Java\\file_reader_editor\\file_reader\\resources\\test.txt");
        Scanner sc = new Scanner(file);
        String body = "";
        // Initializing the array
        String[] words = null;
        List<String> afterSplit = new ArrayList<String>();


        //Searching character
        String searchWord = "<Prospective-Partner-Name>";
        // Username
        String username = "Vihanga Malinda,";
        // Final String of the line
        String lineCombined = "";


        //Looping line by line
        while (sc.hasNextLine()) {

            String newLine = sc.nextLine();
            // System.out.println(newLine);
            words = newLine.split(" ");

            // Looping to find the respective word from the words array
            for (String word : words) {
                if (word.equalsIgnoreCase(searchWord)) {

                    word = username;
                    afterSplit.add(word);

                    break;
                }

                afterSplit.add(word);

            }
            afterSplit.add("\n");


            //System.out.println(sc.nextLine());
        }
        for (String arrObject : afterSplit) {
            //Combining the splitted array
            lineCombined = lineCombined + " " + arrObject;

        }
        body = body + "\n" + lineCombined;
        return body;

    }
}

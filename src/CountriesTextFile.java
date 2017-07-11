import java.io.*;

public class CountriesTextFile {
    static void switchMenu(MyValidator validator) {
        switch (validator.getIntWithinRange("1 - See the list of countries\n2 - Add a country\n3 - Exit", 1, 3)) {
            case 1:
                try {
                    File myFile = new File("countries.txt");
                    // FileReader is a connection stream for characters that connects to a text file

                    FileReader reader = new FileReader(myFile);

                    //BufferedReader allows the File Reader to chain to it
                    //it only goes back to check the file once the buffer is empty
                    BufferedReader buff = new BufferedReader(reader);
                    //declare a string variable to hold each line as it's read from the file
                    String line = null;

                    //this while loop says read a line for text then assign it to the string line
                    //while that variable is not null keep printing lines
                    while ((line = buff.readLine()) != null) { // changed catch to General Exception
                        System.out.println(line);
                    }
                    buff.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    //if the test.txt file does not exist FileWriter will create it
                    FileWriter writer = new FileWriter("countries.txt", true);
                    writer.write("\n");
                    writer.write(validator.getRequiredString("What Country name would you like to add?"));
                    writer.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
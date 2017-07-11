

import java.util.Scanner;

/**
 * Created by Matt on 7/11/2017.
 */
public class CountriesApp {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        MyValidator validator = new MyValidator();

        System.out.println("Welcome to the Countries Maintenance Application");


        boolean cont = true;
        while (cont) {
            //System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit");
            CountriesTextFile.switchMenu(validator);
            System.out.println("Do you want to continue? (y/n):");
            cont = validator.getContinue(scnr.nextLine());
        }

    }

}

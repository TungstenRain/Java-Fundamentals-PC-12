
package ch02pc12;

import java.util.Scanner;

/**
 *
 * @author frank.olson
 * date: 11/1/2017
 */
public class Ch02pc12 {
   
    public static void main(String[] args) {
    
        //variables
        String cityName;
        String upper;
        String lower;
        char letter;
        int nameSize;
        
        //create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Get the city name
        System.out.print("What is your favorite city's name? ");
        cityName = keyboard.nextLine();
        
        //number of characters in the city name
        nameSize = cityName.length();
        System.out.println("City name length: " + nameSize);
        
        //name in allcaps
        upper = cityName.toUpperCase();
        System.out.println("City name in uppercase: " + upper);
        
        //name in lowercase
        lower = cityName.toLowerCase();
        System.out.println("City name in lowercase: " + lower);
                
        //first character in the city name
        letter = cityName.charAt(0);
        System.out.println("First letter of " + cityName + " is: " + letter);
    }
    
}

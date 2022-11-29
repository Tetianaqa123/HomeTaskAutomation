// 1. Frequency dictionary of letters of the alphabet.
//Problem:
//Build a frequency dictionary of letters of the alphabet. Create a method that accepts text and returns a dictionary containing the character and its count
package JavaAdvanced;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int frequency = 1 ;
        char character = ' ' ;
        String linesOfText = " " ;
        int letterTotal = 0;

        char[] alphabet = new char[26] ; // new alphabet array        
        for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
        {
            alphabet[ch-'a']=ch ;
        }

        System.out.println("Please enter some text") ;
        Scanner keyboard = new Scanner(System.in) ;
        linesOfText = keyboard.nextLine() ;

        System.out.println("Letter  Count") ;
        for (int i = 0; i < alphabet.length; i++)
        {   frequency = 0 ;
            for (int j = 0; j < linesOfText.length(); j++) {
                character = linesOfText.charAt(j) ;
                if (character == alphabet[i]) {
                    frequency++ ;
                }
            }

            System.out.println(alphabet[i] + "\t\t" + frequency) ;
            letterTotal += frequency ;
        }

    }
}





package RecursionTDD; 

import java.io.*;

public class Group6 {
  public static void main(String[] args){
    System.out.println(noX("xxxxxxaaaxxxxxxxxddxxxxxxfffxxXXbbXXXX"));
  }
  public static String noX(String str) {

    // Checks if the word's length is 0. If the word's length is 0, returns an empty string.
    if(str.length() == 0){
      return "";

    // Otherwise, if the word's first character is equal to 'x', skips over that character and uses recursion to repeat the method to the string without the 'x'.
    } else if (Character.toLowerCase(str.charAt(0)) == 'x') {
      return noX(str.substring(1));
    }

    // If the string does not contain an 'x', the program repeats the method on the string without skipping any characters
    return str.substring(0,1) + noX(str.substring(1));
  }
}
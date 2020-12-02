public class Group2 {
/**
* Program that finds the sum of the digits in a number
* @author: N. Yung, A. Chan, J. Lin
*
*/

  /**
  * Takes in a number and recursively finds the sum of the digits in the number
  *
  * @param n, the number we are adding up the digits for
  * @return sum of numbers in n
  */
  public static int sumDigits(int n) {
    // Base case, if the number is less than 10, return the number
    if (n < 10) {
      return n;
    }
    else {
      // add the digit at the end to the sum of the rest of the numbers
      return (n % 10) + sumDigits(n / 10);
    }

  }

}

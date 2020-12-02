package recursiontdd;

import java.io.*;

public class Group7 {

  public static void main(String[] args) {



  }

  /**
  * Determines whether the inputted array contains a 6
  *
  * @param nums is the array that is read 
  * @param index is the current starting index
  * @return if the array contains a 6
  */
  public static boolean array6(int[] nums, int index) {


    if (nums[index] == 6) {
      return true;
    }
    return false;

 
    // 4 3 5 1
    // index = 0
    // nums[index] = 4 != 6
    // array6(nums, 1)

  }

}
package RecursionTDD;
import java.io.*;

public class Group4{

  public static int bunnyEars2(int bunnies){
    int intears;
    int bunnyEars2;
  
    intears = 0;

    if(bunnies == 0){
      return intears;
    }
    if(bunnies%2 ==0){
      intears = intears +3;
      return intears + bunnyEars2(bunnies -1);
    }else{
      intears = intears +2;
      return intears + bunnyEars2(bunnies -1);
    }
  }
}

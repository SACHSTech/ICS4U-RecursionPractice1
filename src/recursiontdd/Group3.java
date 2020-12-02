package recursiontdd;
import java.io.*;

public class Group3{
  public static int countX(String str){
    if (str.length() == 0) {
      return 0;
    } else if(str.charAt(0) == 'x'){
      return 1 + (Group3.countX(str.substring(1)));
    } else{
      return 0 + Group3.countX(str.substring(1));
    }
  }
}
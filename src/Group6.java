import java.io.*;

public class Group6 {
  public static void main (String[] args){
    System.out.println(noX("xadacxxxadaxaxadax"));
}  

  public static String noX(String str) {
    if(str.length() == 0){
      return str;
    } else {
      if (str.charAt(0) == 'x') {
        return noX(str.substring(1),'x');
      } else {
        return str.charAt(0) + noX(str.substring(1),'x');
      }
    }
  }
}

/*    String strResult;
    strResult = str;
    // base case
    if (str.equals("")) {
      return "";
    } else {
      // recursive step
      for (int intLoop = 0; intLoop < str.length(); intLoop++) {
        if(str.charAt(intLoop) == 'x') {
          strResult = str.replace("x","");
        }
      }
    }
    return strResult;
  }
} */
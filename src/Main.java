package src;
import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// import Group3.java;

public class Main{
   public static void main(String args[]) throws IOException{
     BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
      //String strTest = xxhixno;
      //int intx;

      //intx = Group3.countX(strTest);
      assertEquals(3,Group3.countX("xxhixno"));
      //System.out.println(intx);
      System.out.println(Group3.countX("xxhixno"));
   }
}
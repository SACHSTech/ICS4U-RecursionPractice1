package RecursionTDD;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

import RecursionTDD.Group4;

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/
public class Group4Test {

    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        //assertEquals(EXPECTEDVALUE, yourClassToTest.methodToTest());
    }
    
    // add more tests
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int intNumEars;
    int bunnies;
    bunnies = Integer.parseInt(keyboard.readLine());
    intNumEars = Group4.bunnyEars2(bunnies);
    System.out.println(intNumEars);
    
  }
}


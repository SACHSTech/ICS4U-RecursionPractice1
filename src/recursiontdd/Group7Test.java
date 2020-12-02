package recursiontdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursiontdd.Group7.*;

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/
public class Group7Test {

  /**
    * An initial test
    */
  @Test
  public void Test1() {
    // make assertion statement(s)
    //assertEquals(EXPECTEDVALUE, yourClassToTest.methodToTest());
    assertEquals(true, Group7.array6(new int[]{6, 5, 9, 7}, 0));
  }

  
}

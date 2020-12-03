package recursiontdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursiontdd.Group2;

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/
public class Group2Test {

    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        assertEquals(1, Group2.sumDigits(1));
    }

    @Test
    public void Test2(){
        // make assertion statement(s)
        assertEquals(6, Group2.sumDigits(123));
    }
  
}

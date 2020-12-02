package recursiontdd;
import static org.junit.jupiter.api.Assertions.*;
import recursiontdd.Group3;
import org.junit.jupiter.api.Test;

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/
public class Group3Test {

    /**
     * An initial test
     */
    @Test
    public void Group3test() {
      assertEquals(3,Group3.countX("xxhixno"));
        // make assertion statement(s)
        //assertEquals(EXPECTEDVALUE, yourClassToTest.methodToTest());
    }
    @Test
    public void Group3test2() {
      assertEquals(2,Group3.countX("dXxXXdXx"));
      
    }
    @Test
    public void Group3test3() {
      assertEquals(9,Group3.countX("xxxxxxxxx"));
      
    }
    @Test
    public void Group3test4() {
      assertEquals(2,Group3.countX("xxnolol"));
      
    }
    
}
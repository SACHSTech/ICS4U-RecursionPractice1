package RecursionTDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import RecursionTDD.Group5;

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/
public class Group5Test {

    /**
     * Testing base case
     */
    @Test
    public void Test1(){
      assertEquals("", Group5.changeXY(""));
    }

    @Test
    public void Test2(){
      assertEquals("codey", Group5.changeXY("codex"));
    }

    @Test 
    public void Test3(){
      assertEquals("yyhiyy", Group5.changeXY("xxhixx"));
    }

    @Test 
    public void Test4(){
      assertEquals("yhiyhiy", Group5.changeXY("xhixhix"));
    }
    
   
}

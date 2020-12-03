package RecursionTDD; 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import RecursionTDD.Group6;

public class Group6Test {

    /**
     * An initial test
     */
    @Test
    public void Test1(){
      // make assertion statement(s)
      //assertEquals(EXPECTEDVALUE, yourClassToTest.methodToTest());
      assertEquals("ab", Group6.noX("xaxb"));

    }
    @Test
    public void Test2(){
      // make assertion statement(s)
      //assertEquals(EXPECTEDVALUE, yourClassToTest.methodToTest());
      assertEquals("abc", Group6.noX("abc"));

    }
    @Test
    public void Test3(){
      // make assertion statement(s)
      //assertEquals(EXPECTEDVALUE, yourClassToTest.methodToTest());
      assertEquals("", Group6.noX("xx"));

    }
    
    // add more tests
}

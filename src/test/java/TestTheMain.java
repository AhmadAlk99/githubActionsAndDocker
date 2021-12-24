import com.sun.tools.javac.Main;
import org.junit.*;
import static org.junit.Assert.*;

public class TestTheMain {
    @Before
    public  void befortest(){
        System.out.println("hi befor");
    }

    @Test
    public  void test(){
int [] array = {22,33, 44, 55 ,66};
int s=streams.number(array);
assertEquals(s,55);
    }
    @Test
    public void test2(){


        assertEquals(testing.testoo(95),"Excellent");
        assertEquals(testing.testoo(88),"Good");
        assertEquals(testing.testoo(77),"Pass");
        assertEquals(testing.testoo(33),"Fail");
    }
    @After
    public  void aftertest(){
        System.out.println("hi after");
    }
}

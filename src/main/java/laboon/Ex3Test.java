import org.junit.Test;
import static org.junit.Assert.*;

import sumanyu.ex3;

public class Ex3Test {

    @Test
    public void testTriangle1() {
    	assertEquals(ex3.triangle(1), 1);
    }

    @Test
    public void testTriangle2() {
        assertEquals(ex3.triangle(3), 6);
    }

    @Test
    public void testTriangle3() {
        assertEquals(ex3.triangle(9), 45);
    }

    @Test
    public void testLazy1() {
        assertEquals(ex3.lazyCaterer(1), 2);
    }

    @Test
    public void testLazy2() {
        assertEquals(ex3.lazyCaterer(4), 11);
    }

    @Test
    public void testLazy3() {
        assertEquals(ex3.lazyCaterer(10), 56);
    }
        
    
}

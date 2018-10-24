package pl.akademiakodu;

import org.junit.*;
import static org.junit.Assert.*;
public class SolutionTest {
    @Test
    public void Test1() {
        Solution solution = new Solution();
        assertEquals(solution.IsFibonacci(3), true);
    }
    @Test
    public void Test2() {
        Solution solution = new Solution();
        assertEquals(solution.IsFibonacci(6), false);
    }
}
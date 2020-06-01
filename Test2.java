import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2 {
    int[] a = {1, 1, 4, 1};
    int[] b = {3, 4, 6, 1};
    int[] c = {2, 2, 2, 2};

    @Test
    public void testMethod2_1() {
        Assertions.assertTrue(MainClass.methodTwo(a));
    }

    @Test
    public void testMethod2_2() {
        Assertions.assertTrue(MainClass.methodTwo(b));
    }

    @Test
    public void testMethod2_3() {
        Assertions.assertTrue(MainClass.methodTwo(c));
    }
}

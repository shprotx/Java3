import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    int[] input1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
    int[] result1 = {1, 7};
    int[] input2 = {1, 2, 4, 4, 2, 3, 4, 88, 71, 36};
    int[] result2 = {88, 71, 36};
    int[] input3 = {1, 2, 3, 4, 5, 3};
    int[] result3 = {5, 3};

    @Test
    public void testMethod1_1() {
        Assertions.assertArrayEquals(result1, MainClass.methodOne(input1));
    }

    @Test
    public void testMethod1_2() {
        Assertions.assertArrayEquals(result2, MainClass.methodOne(input2));
    }

    @Test
    public void testMethod1_3() {
        Assertions.assertArrayEquals(result3, MainClass.methodOne(input3));
    }


}

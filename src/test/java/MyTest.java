import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testSomething() {

        int[] input = new int[]{-1, -2, -3, -4, -5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{-1, 2, -3, 4, -5};
        expected = new int[]{1, -2, 3, -4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{};
        expected = new int[]{};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{0};
        expected = new int[]{0};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));
    }

    private static class Kata {
        public static int[] invert(int[] array) {
            for (int i = 0; i < array.length; i++)
                array[i] = -(array[i]);
            return array;
        }
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarmUpTest {

    @Test
    public void multiplication() {
        int a = 0;
        int b = 0;

        assertEquals(WarmUpTestt.multiplication(a, b), a * b);
        a = -5;
        b = -10;
        assertEquals(WarmUpTestt.multiplication(a, b), a * b);
        a = -5;
        b = 10;
        assertEquals(WarmUpTestt.multiplication(a, b), a * b);
        a = 5;
        b = -10;
        assertEquals(WarmUpTestt.multiplication(a, b), a * b);
        a = 5;
        b = 10;
        assertEquals(WarmUpTestt.multiplication(a, b), a * b);
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarmUpTest {

    @Test
    public void multiplication() {
        int a, b, c;

        a = -100 + (int) (Math.random() * 100);
        b = -100 + (int) (Math.random() * 100);

        c = a * b;


        assertEquals(WarmUpTestt.multiplication(a, b), c);
    }
}
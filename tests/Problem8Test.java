import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {
    @Test
    public void problem8Test() {
        long expected13 = 23514624000L, expected4 = 5832L;
        assertEquals(expected4, Problem8.main(4));
        assertEquals(expected13, Problem8.main(13));
    }
}
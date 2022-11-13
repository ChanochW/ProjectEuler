import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem10Test {

    @Test
    void problem10Test() {
        long ceiling1 = 10, ceiling2 = 2000000L, expected1 = 17L, expected2 = 142913828922L;
        assertEquals(expected1, Problem10.main(ceiling1));
        assertEquals(expected2, Problem10.main(ceiling2));
    }
}
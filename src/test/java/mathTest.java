import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mathTest {

    @Test
    void add() {
        math math = new math();
        int expected = 2;
        int actual = math.add(1,1);
        assertEquals(expected, actual, "The add method should add two numbers correctly");

    }
}
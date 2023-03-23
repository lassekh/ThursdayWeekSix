package TaskFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square s;
    @BeforeEach
    void setUp() {
        s = new Square(4);
        s.getArea();
    }

    @Test
    void getArea() {
        assertEquals(16,s.getArea());
    }
}
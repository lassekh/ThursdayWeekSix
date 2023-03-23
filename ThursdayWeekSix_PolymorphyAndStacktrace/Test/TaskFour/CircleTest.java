package TaskFour;

import static org.junit.jupiter.api.Assertions.*;


class CircleTest {
    Circle c;
    Square s;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        c = new Circle(6);
        c.getArea();
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(36,c.getArea());
    }
}
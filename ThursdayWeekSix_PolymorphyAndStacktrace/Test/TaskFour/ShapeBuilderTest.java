package TaskFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {
    ShapeBuilder build;
    @BeforeEach
    void setUp() {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);
        Square s1 = new Square(4);
        Square s2 = new Square(9);
        build = new ShapeBuilder();
        build.addShape(c1);
        build.addShape(c2);
        build.addShape(s1);
        build.addShape(s2);
    }

    @Test
    void addShape() {
    }

    @Test
    void getTotalArea() {
        assertEquals(400,build.getTotalArea(build.shapes));
    }
}
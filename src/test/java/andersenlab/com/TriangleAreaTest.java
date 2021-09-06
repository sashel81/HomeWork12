package andersenlab.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThrows;

public class TriangleAreaTest {
    @Test
    public void itValidatesArea() {
        float expectedArea = 12.0f;
        Triangle tr = new Triangle();
        float actualArea = TriangleAction.areaCounter(6, 5, 5);
        assertEquals(actualArea, expectedArea, 0);
    }

    @Test
    public void shouldThrowException() {

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            TriangleAction.areaCounter(-6, -5, 5);
        });
        assertEquals(exception.getMessage(), "argument of function is negative");
    }
}


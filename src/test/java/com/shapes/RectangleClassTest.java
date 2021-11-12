import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleClassTest {
    @Test
    public void shouldCalculateAreaWhenWidthandHeightofRectangleGiven()
    {
        assertEquals(15,Rectangle.calculate(5,3));
    }
}

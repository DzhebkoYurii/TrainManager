import org.example.objects.Wagon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WagonTest {
    private Wagon wagon;

    @BeforeEach
    public void setUp() {
        wagon = new Wagon(5, 100, 80, "Economy", 1);
    }

    @Test
    public void testAddPassengers() {
        assertTrue(wagon.addPassengers(80));

        assertFalse(wagon.addPassengers(81));
    }

    @Test
    public void testRemovePassengers() {
        assertTrue(wagon.removePassengers(20));

        assertFalse(wagon.removePassengers(21));
    }

    @Test
    public void testGetComfortLevel() {
        assertEquals(5, wagon.getComfortLevel());
    }

    @Test
    public void testGetCapacity() {
        assertEquals(100, wagon.getCapacity());
    }

    @Test
    public void testGetFreePlaces() {
        assertEquals(80, wagon.getFreePlaces());
    }

    @Test
    public void testGetWagonType() {
        assertEquals("Economy", wagon.getWagonType());
    }

    @Test
    public void testGetWagonNumber() {
        assertEquals(1, wagon.getWagonNumber());
    }

    @Test
    public void testToString() {
        String expected = "Wagon{рівень комфорту = 5, кількість місць = 100, вільні місця = 80, тип вагону = Economy, номер вагону = 1}";
        assertEquals(expected, wagon.toString());
    }
}

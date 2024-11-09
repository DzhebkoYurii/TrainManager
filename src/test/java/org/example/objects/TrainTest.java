import org.example.objects.Train;
import org.example.objects.Wagon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrainTest {
    private Train train;
    private List<Wagon> wagons;

    @BeforeEach
    public void setUp() {
        wagons = new ArrayList<>();
        wagons.add(new Wagon(5, 100, 80, "Economy", 1));
        wagons.add(new Wagon(7, 50, 25, "Business", 2));
        train = new Train(12345, "Kyiv-Lviv", wagons);
    }

    @Test
    public void testAddWagon() {
        Wagon newWagon = new Wagon(4, 60, 50, "First Class", 3);
        train.addWagon(newWagon);
        assertEquals(3, train.getWagons().size());
        assertEquals(newWagon, train.getWagons().get(2));
    }

    @Test
    public void testRemoveWagon() {
        Wagon wagonToRemove = train.getWagons().get(0);
        train.removeWagon(wagonToRemove);
        assertEquals(1, train.getWagons().size());
        assertFalse(train.getWagons().contains(wagonToRemove));
    }

    @Test
    public void testMakeReady() {
        train.makeReady();
        assertTrue(train.isReady());
    }

    @Test
    public void testIsReady() {
        assertTrue(train.isReady());
    }

    @Test
    public void testGetTrainNumber() {
        assertEquals(12345, train.getTrainNumber());
    }

    @Test
    public void testGetRoute() {
        assertEquals("Kyiv-Lviv", train.getRoute());
    }

    @Test
    public void testGetWagons() {
        assertEquals(wagons, train.getWagons());
    }

    @Test
    public void testSetTrainNumber() {
        train.setTrainNumber(54321);
        assertEquals(54321, train.getTrainNumber());
    }

    @Test
    public void testSetRoute() {
        train.setRoute("Lviv-Odesa");
        assertEquals("Lviv-Odesa", train.getRoute());
    }

    @Test
    public void testToString() {
        String expected = "Train №12345 route: 'Kyiv-Lviv' has 2 wagons.";
        assertEquals(expected, train.toString());
    }
}

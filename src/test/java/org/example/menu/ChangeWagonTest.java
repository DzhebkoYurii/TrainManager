import org.example.objects.Train;
import org.example.objects.Wagon;
import org.example.menu.ChangeWagon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class ChangeWagonTest {
    private ChangeWagon changeWagon;
    private Train mockTrain;
    private List<Wagon> wagons;

    @BeforeEach
    public void setUp() {
        mockTrain = mock(Train.class);
        changeWagon = new ChangeWagon(mockTrain);
        Wagon wagon1 = new Wagon(1, 20, 10, "luxe", 1);
        Wagon wagon2 = new Wagon(2, 22, 12, "luxe", 2);
        wagons = new ArrayList<Wagon>();
        wagons.add(wagon1);
        wagons.add(wagon2);
        mockTrain = new Train(1, "Lviv-Kyiv", wagons);
    }

    @Test
    public void testDeleteWagon() {
        Wagon wagon = wagons.get(0);
        assertEquals(mockTrain.removeWagon(wagon), 1);
        assertEquals(mockTrain.getWagons(), wagons);
    }

    @Test
    public void testAddPassengers_true() {
        assertTrue(wagons.get(0).addPassengers(10));
    }

    @Test
    public void testAddPassengers_false() {
        assertFalse(wagons.get(0).addPassengers(11));
    }

    @Test
    public void testRemovePassengers_true() {
        assertTrue(wagons.get(0).removePassengers(10));
    }

    @Test
    public void testRemovePassengers_false() {
        assertFalse(wagons.get(0).removePassengers(11));
    }

    @Test
    public void checkName(){
        assertEquals(changeWagon.getName(), "Редагувати вагон");
    }
}

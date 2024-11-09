import org.example.menu.ChangeWagon;
import org.example.objects.Train;
import org.example.objects.Wagon;
import org.example.menu.CountPassengers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class CountPassengersTest {
    private CountPassengers countPassengers;
    private Train train;
    private List<Wagon> wagons;

    @BeforeEach
    public void setUp() {
        Wagon wagon1 = new Wagon(1, 20, 10, "luxe", 1);
        Wagon wagon2 = new Wagon(2, 22, 12, "luxe", 2);
        wagons = new ArrayList<Wagon>();
        wagons.add(wagon1);
        wagons.add(wagon2);
        train = new Train(1, "Lviv-Kyiv", wagons);
        countPassengers = new CountPassengers(train);
    }

    @Test
    public void testCountGeneral(){
        assertEquals(countPassengers.countGeneral(), 20);
    }

    @Test
    public void testCountWagon(){
        assertEquals(countPassengers.countWagon(wagons.get(0)), 10);
        assertEquals(countPassengers.countWagon(wagons.get(1)), 10);
    }

    @Test
    public void checkName(){
        assertEquals(countPassengers.getName(), "Підрахувати кількість пасажирів");
    }
}

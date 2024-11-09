import org.example.menu.FindWagon;
import org.example.objects.Train;
import org.example.objects.Wagon;
import org.example.menu.SortWagons;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SortWagonsTest {
    private SortWagons sortWagons;
    private Train train;
    private List<Wagon> wagons;

    @BeforeEach
    public void setUp() {
        Wagon wagon1 = new Wagon(1, 20, 3, "luxe", 1);
        Wagon wagon2 = new Wagon(2, 22, 12, "luxe", 2);
        wagons = new ArrayList<Wagon>();
        wagons.add(wagon1);
        wagons.add(wagon2);
        train = new Train(1, "Lviv-Kyiv", wagons);
        sortWagons = new SortWagons(train);
    }

    @Test
    public void testSortWagons() {
        SortWagons sortWagons = new SortWagons(train);
        assertEquals(1, train.getWagons().get(0).getComfortLevel());
        assertEquals(2, train.getWagons().get(1).getComfortLevel());

        sortWagons.execute();

        assertEquals(2, train.getWagons().get(0).getComfortLevel());
        assertEquals(1, train.getWagons().get(1).getComfortLevel());
    }

    @Test
    public void checkName(){
        assertEquals(sortWagons.getName(), "Посортувати вагони на основі рівня комфортності");
    }
}

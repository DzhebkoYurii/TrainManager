import org.example.menu.CountPassengers;
import org.example.objects.Train;
import org.example.objects.Wagon;
import org.example.menu.FindWagon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FindWagonTest {
    private FindWagon findWagon;
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
        findWagon = new FindWagon(train);
    }

    @Test
    public void testFindWagon_all() {
        assertEquals(findWagon.finder_pass(20, 22), 2);
    }

    @Test
    public void testFindWagon_first() {
        assertEquals(findWagon.finder_pass(17, 20), 1);
    }

    @Test
    public void testFindWagon_second() {
        assertEquals(findWagon.finder_pass(22, 100), 1);
    }

    @Test
    public void testFindWagon_none() {
        assertEquals(findWagon.finder_pass(1, 2), 0);
    }

    @Test
    public void checkName(){
        assertEquals(findWagon.getName(), "Знайти вагони за заданими параметрами");
    }
}

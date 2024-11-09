import org.example.objects.Train;
import org.example.objects.Wagon;
import org.example.menu.AddWagon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AddWagonTest {
    private AddWagon addWagon;
    private Train mockTrain;
    private List<Wagon> wagons;

    @BeforeEach
    public void setUp() {
        mockTrain = mock(Train.class);
        addWagon = new AddWagon(mockTrain);
        Wagon wagon1 = new Wagon(1, 20, 10, "luxe", 1);
        Wagon wagon2 = new Wagon(2, 22, 12, "luxe", 2);
        wagons = List.of(wagon1, wagon2);
        mockTrain = new Train(1, "Lviv-Kyiv", wagons);
    }

    @Test
    public void testAddWagon() {
        assertEquals(mockTrain.getWagons(), wagons);
    }

    @Test
    public void checkedWagonNumber_isCorrect() {
        assertEquals(addWagon.checkWagonNumber(3), 3);
    }

    @Test
    public void checkedFreePlaces_isCorrect() {
        assertEquals(addWagon.checkFreePlaces(20, 19), 19);
        assertEquals(addWagon.checkFreePlaces(20, 20), 20);
    }

    @Test
    public void checkName(){
        assertEquals(addWagon.getName(), "Додати вагон");
    }
}

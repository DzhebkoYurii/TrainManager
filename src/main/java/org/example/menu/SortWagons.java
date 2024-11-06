package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class SortWagons implements MenuItem {
    List<Train> trains;

    public SortWagons(List<Train> trainsArr) {
        this.trains = trainsArr;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Посортувати вагони на основі рівня комфортності";
    }
}

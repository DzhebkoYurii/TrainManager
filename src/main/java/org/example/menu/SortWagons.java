package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class SortWagons implements MenuItem {
    Train train;

    public SortWagons(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Посортувати вагони на основі рівня комфортності";
    }
}

package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class FindWagon implements MenuItem {
    Train train;

    public FindWagon(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Знайти вагони за заданими параметрами";
    }
}

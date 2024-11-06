package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class FindWagon implements MenuItem {
    List<Train> trains;

    public FindWagon(List<Train> trainsArr) {
        this.trains = trainsArr;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Знайти вагони за заданими параметрами";
    }
}

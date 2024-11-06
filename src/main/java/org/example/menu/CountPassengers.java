package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class CountPassengers implements MenuItem {
    List<Train> trains;

    public CountPassengers(List<Train> trainsArr) {
        this.trains = trainsArr;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Підрахувати кількість пасажирів";
    }
}

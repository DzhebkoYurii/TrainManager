package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class CountPassengers implements MenuItem {
    Train train;

    public CountPassengers(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Підрахувати кількість пасажирів";
    }
}

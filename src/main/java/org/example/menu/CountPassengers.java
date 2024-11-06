package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class CountPassengers implements MenuItem {
    Train train;

    public CountPassengers(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){
        if (train == null || train.getWagons().isEmpty()) {
            System.out.println("Поїзда чи вагонів не існує.");
            return;
        }

        int totalPassengers = 0;

        for (Wagon wagon : train.getWagons()){
            totalPassengers += wagon.getCapacity() - wagon.getFreePlaces();
        }

        System.out.println("Загальна кількість пасажирів в потязі: " + totalPassengers);
        for (Wagon wagon : train.getWagons()){
            System.out.println("Кількість пасажирів в вагоні №" + wagon.getWagonNumber() + ": " + (wagon.getCapacity() - wagon.getFreePlaces()));
        }
    }

    @Override
    public String getName() {
        return "Підрахувати кількість пасажирів";
    }
}

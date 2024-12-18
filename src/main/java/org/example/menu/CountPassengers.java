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

        int totalPassengers = countGeneral();
        System.out.println("Загальна кількість пасажирів в потязі: " + totalPassengers);

        for (Wagon wagon : train.getWagons()){
            System.out.println("Кількість пасажирів в вагоні №" + wagon.getWagonNumber() + ": " + countWagon(wagon));
        }
    }

    public int countGeneral(){
        int passengers = 0;

        for (Wagon wagon : train.getWagons()){
            passengers += wagon.getCapacity() - wagon.getFreePlaces();
        }

        return passengers;
    }

    public int countWagon(Wagon wagon){
        return wagon.getCapacity() - wagon.getFreePlaces();
    }


    @Override
    public String getName() {
        return "Підрахувати кількість пасажирів";
    }
}

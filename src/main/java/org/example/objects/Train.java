package org.example.objects;

import org.example.menu.*;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private int trainNumber;
    private String route;
    private List<Wagon> wagons;

    public Train(int trainNumber, String route, List<Wagon> wagons) {
        this.trainNumber = trainNumber;
        this.route = route;
        this.wagons = wagons;
    }
    public Train(int trainNumber, String route) {
        this.trainNumber = trainNumber;
        this.route = route;
        this.wagons = new ArrayList<Wagon>();
    }


    public int getTrainNumber() {
        return trainNumber;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "Train №" + trainNumber + "route '" + route + "' has " + wagons.size() + " wagons.";
    }
}

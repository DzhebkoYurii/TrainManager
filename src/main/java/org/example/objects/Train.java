package org.example.objects;


import java.util.ArrayList;
import java.util.List;

public class Train {
    private int trainNumber;
    private String route;
    private List<Wagon> wagons;
    private boolean ready;

    public Train() {
        this.wagons = new ArrayList<Wagon>();
        this.ready = false;
    }

    public Train(int trainNumber, String route, List<Wagon> wagons) {
        this.trainNumber = trainNumber;
        this.route = route;
        this.wagons = wagons;
        this.ready = true;
    }
    public Train(int trainNumber, String route) {
        this.trainNumber = trainNumber;
        this.route = route;
        this.wagons = new ArrayList<Wagon>();
        this.ready = false;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void removeWagon(Wagon wagon) {
        wagons.remove(wagon);
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void makeReady() {
        this.ready = true;
    }

    public boolean isReady(){
        return this.ready;
    }


    @Override
    public String toString() {
        return "Train №" + trainNumber + " route: '" + route + "' has " + wagons.size() + " wagons.";
    }

    public void addWagon(Wagon wagon){
        this.wagons.add(wagon);
    }
}

package org.example.objects;

import org.example.logger.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Train {
    private int trainNumber;
    private String route;
    private List<Wagon> wagons;
    private boolean ready;

    private static final Logger logger = AppLogger.getLogger();

    public Train() {
        this.wagons = new ArrayList<Wagon>();
        this.ready = false;

        logger.info("Train instance created.");
    }

    public Train(int trainNumber, String route, List<Wagon> wagons) {
        this.trainNumber = trainNumber;
        this.route = route;
        this.wagons = wagons;
        this.ready = true;

        logger.info("Train instance created.");
    }
    public Train(int trainNumber, String route) {
        this.trainNumber = trainNumber;
        this.route = route;
        this.wagons = new ArrayList<Wagon>();
        this.ready = false;

        logger.info("Train instance created.");
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void addWagon(Wagon wagon){
        this.wagons.add(wagon);
        logger.info("Added wagon: " + wagon.getWagonNumber());
    }

    public int removeWagon(Wagon wagon) {
        if (!wagons.remove(wagon)) {
            logger.warning("Failed to remove wagon: " + wagon.getWagonNumber());
        } else {
            logger.info("Removed wagon: " + wagon.getWagonNumber());
        }
        return wagons.size();
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
        logger.info("Train number set to: " + trainNumber);
    }

    public void setRoute(String route) {
        this.route = route;
        logger.info("Route set to: " + route);
    }

    public void makeReady() {
        this.ready = true;
        logger.info("Train is ready.");
    }

    public boolean isReady(){
        return this.ready;
    }


    @Override
    public String toString() {
        return "Train №" + trainNumber + " route: '" + route + "' has " + wagons.size() + " wagons.";
    }
}

package org.example.menu;

import org.example.objects.*;

import java.util.List;

public class AddWagon implements MenuItem {
    Train train;

    public AddWagon(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Додати вагон";
    }
}
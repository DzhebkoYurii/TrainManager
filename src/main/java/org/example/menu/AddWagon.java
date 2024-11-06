package org.example.menu;

import org.example.objects.*;

import java.util.List;

public class AddWagon implements MenuItem {
    List<Train> trains;

    public AddWagon(List<Train> trainsArr) {
        this.trains = trainsArr;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Додати вагон";
    }
}
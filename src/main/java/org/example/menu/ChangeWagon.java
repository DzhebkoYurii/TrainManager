package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class ChangeWagon implements MenuItem {
    List<Train> trains;

    public ChangeWagon(List<Train> trainsArr) {
        this.trains = trainsArr;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Редагувати вагон";
    }
}
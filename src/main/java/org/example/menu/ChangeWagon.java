package org.example.menu;
import org.example.objects.*;

import java.util.List;

public class ChangeWagon implements MenuItem {
    Train train;

    public ChangeWagon(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){}

    @Override
    public String getName() {
        return "Редагувати вагон";
    }
}
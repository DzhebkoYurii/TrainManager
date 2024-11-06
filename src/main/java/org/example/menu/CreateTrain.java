package org.example.menu;
import org.example.objects.*;

import java.util.List;
import java.util.Scanner;

public class CreateTrain implements MenuItem {
    Scanner scanner = new Scanner(System.in);
    List<Train> trains;

    public CreateTrain(List<Train> trainsArr) {
        this.trains = trainsArr;
    }

    @Override
    public void execute(){

    }

    @Override
    public String getName() {
        return "Створити потяг";
    }
}

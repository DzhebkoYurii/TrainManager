package org.example;
import org.example.menu.*;
import org.example.objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Train> trains = new ArrayList<Train>();
        System.out.println(trains.size());

        Menu menu = new Menu();
        menu.addItem(new CreateTrain(trains));
        menu.addItem(new AddWagon(trains));
        menu.addItem(new ChangeWagon(trains));
        menu.addItem(new CountPassengers(trains));
        menu.addItem(new FindWagon(trains));
        menu.addItem(new SortWagons(trains));

        int choice;
        do {
            int i = 1;
            for (MenuItem command : menu.commands){
                System.out.println(i++ + ". " + command.getName());
            }
            System.out.println(i + ". Вийти");

            choice = scanner.nextInt();
            menu.execute(choice);
        }while (choice - 1 != menu.commands.size());
    }
}
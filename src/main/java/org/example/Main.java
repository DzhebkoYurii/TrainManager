package org.example;
import org.example.menu.*;
import org.example.objects.*;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Train train = new Train();

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new CreateTrain(train));
        menu.addItem(new AddWagon(train));
        menu.addItem(new ChangeWagon(train));
        menu.addItem(new CountPassengers(train));
        menu.addItem(new FindWagon(train));
        menu.addItem(new SortWagons(train));

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
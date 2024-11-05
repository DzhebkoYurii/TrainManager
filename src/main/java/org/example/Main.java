package org.example;
import org.example.menu.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        menu.addItem(new CreateTrain());
        menu.addItem(new AddWagon());
        menu.addItem(new ChangeWagon());
        menu.addItem(new CountPassengers());
        menu.addItem(new FindWagon());
        menu.addItem(new SortWagons());

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
package org.example;
import org.example.menu.*;
import org.example.objects.*;
import org.example.logger.*;

import java.util.Scanner;
import java.util.logging.Level;

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

        var logger = AppLogger.getLogger();

        // Симулювати критичну помилку
        try {
            throw new RuntimeException("Test critical error - example for email alert.");
        } catch (Exception e) {
            // Записати критичну помилку в лог, щоб перевірити надсилання email
            logger.log(Level.SEVERE, "Critical error occurred", e);
        }

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
package org.example.menu;
import org.example.objects.*;

import java.util.List;
import java.util.Scanner;

public class ChangeWagon implements MenuItem {
    private static Scanner scanner = new Scanner(System.in);
    Train train;

    public ChangeWagon(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){
        if (train == null || train.getWagons().isEmpty()) {
            System.out.println("Поїзда чи вагонів не існує.");
            return;
        }

        System.out.println("Ось наявні вагони: ");
        for (Wagon wagon : train.getWagons()){
            System.out.println(wagon);
        }

        System.out.print("Введіть номер вагона, який хочете змінити: ");
        int wagonNumber = scanner.nextInt();
        Wagon wagon = null;
        for (Wagon newWagon : train.getWagons()){
            if (newWagon.getWagonNumber() == wagonNumber){
                wagon = newWagon;
                break;
            }
        }

        if (wagon == null) {
            System.out.println("Вагон не знайдено!");
            return;
        }


        System.out.println("Що саме ви хочете зробити з вагоном №" + wagonNumber);
        System.out.println("1.Видалити вагон");
        System.out.println("2.Додати пасажирів");
        System.out.println("3.Вилучити пасажирів");
        int choice = scanner.nextInt();

        switch (choice){
            case 1 -> train.removeWagon(wagon);
            case 2 -> addPassengers(wagon);
            case 3 -> removePassengers(wagon);
            default -> System.out.println("Неправильний вибір!");
        }

    }

    public void addPassengers(Wagon wagon){
        System.out.print("Скільки пасажирів додати? ");
        int passengers = scanner.nextInt();
        wagon.addPassengers(passengers);
        System.out.println("Пасажири додані!");
    }

    public void removePassengers(Wagon wagon){
        System.out.print("Скільки пасажирів видалити? ");
        int passengers = scanner.nextInt();
        wagon.removePassengers(passengers);
        System.out.println("Пасажирів вилучено!");
    }


    @Override
    public String getName() {
        return "Редагувати вагон";
    }
}
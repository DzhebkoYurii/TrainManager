package org.example.menu;

import org.example.objects.*;

import java.util.Scanner;

public class AddWagon implements MenuItem {
    Scanner scanner = new Scanner(System.in);
    Train train;

    public AddWagon(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){
        if (!train.isReady()) {
            System.out.println("Спочатку потрібно створити поїзд!");
            return;
        }

        System.out.print("Введіть номер вагона: ");
        int newWagonNumber = scanner.nextInt();
        int wagonNumber = checkWagonNumber(newWagonNumber);
        System.out.print("Введіть рівень комфорту: ");
        int comfortLevel = scanner.nextInt();
        System.out.print("Введіть кількість місць: ");
        int capacity = scanner.nextInt();
        System.out.print("Введіть кількість пасажирів: ");
        int fullPlaces = scanner.nextInt();
        scanner.nextLine();
        int freePlaces = capacity - checkFreePlaces(capacity, fullPlaces);
        System.out.print("Введіть тип вагону: ");
        String wagonType = scanner.nextLine();

        Wagon wagon = new Wagon(comfortLevel, capacity, freePlaces, wagonType, wagonNumber);
        train.addWagon(wagon);
        System.out.println("Wagon added successfully.");
    }

    public int checkWagonNumber(int number){
        boolean check = false;
        int newNumber = number;
        for (Wagon wagon : train.getWagons()){
            if (wagon.getWagonNumber() == number){
                System.out.print("Вагон з таким номером вже існує! Введіть інший номер: ");
                newNumber = scanner.nextInt();
                check = true;
                break;
            }
        }
        if (check){
            number = checkWagonNumber(newNumber);
        }
        return number;
    }

    public int checkFreePlaces(int capacity, int fullPlaces){
        if (fullPlaces > capacity){
            System.out.println("Кількість пасажирів більша за можливу!!");
            System.out.print("Введіть іншу кількість пасажирів: ");
            int passengers = scanner.nextInt();
            scanner.nextLine();
            fullPlaces = checkFreePlaces(capacity, passengers);
        }
        return fullPlaces;
    }

    @Override
    public String getName() {
        return "Додати вагон";
    }
}
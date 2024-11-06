package org.example.menu;
import org.example.objects.*;

import java.util.Scanner;

public class FindWagon implements MenuItem {
    private static Scanner scanner = new Scanner(System.in);
    Train train;

    public FindWagon(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){
        if (train == null || train.getWagons().isEmpty()) {
            System.out.println("Поїзда чи вагонів не існує.");
            return;
        }

        System.out.print("Введіть мінімальну кількість пасажирів: ");
        int minPassengers = scanner.nextInt();
        System.out.print("Введіть максимальну кількість пасажирів: ");
        int maxPassengers = scanner.nextInt();


        boolean check = false;
        for (Wagon wagon : train.getWagons()){
            if (wagon.getCapacity() > minPassengers && wagon.getCapacity() < maxPassengers){
                System.out.println(wagon);
                check = true;
            }
        }
        if (!check){
            System.out.println("Таких вагонів немає!");
        }
    }

    @Override
    public String getName() {
        return "Знайти вагони за заданими параметрами";
    }
}

package org.example.menu;
import org.example.objects.*;

import java.util.Scanner;

public class CreateTrain implements MenuItem {
    Scanner scanner = new Scanner(System.in);
    Train train;

    public CreateTrain(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){
        if (train.isReady()){
            System.out.println("Створений потяг буде видалено і створено новий!");
            System.out.println("Впевнені що хочете цього? (1 - так;  0 - ні, відмінити створення)");
            if (scanner.nextInt() == 0){
                return;
            }
        }

        System.out.println("Введіть номер поїзда: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть маршрут поїзда: ");
        String trainName = scanner.nextLine();

        train.setTrainNumber(trainNumber);
        train.setRoute(trainName);
        if (!train.isReady()){
            train.makeReady();
        }

        System.out.println("New train: " + train);

        System.out.println("Скільки початкових вагонів ви хочете створити: ");
        int wagonsCount = scanner.nextInt();
        MenuItem command = new AddWagon(train);
        for (int i = 0; i < wagonsCount; i++){
            command.execute();
        }
    }

    @Override
    public String getName() {
        return "Створити новий потяг";
    }
}

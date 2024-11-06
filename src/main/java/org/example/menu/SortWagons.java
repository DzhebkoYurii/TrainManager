package org.example.menu;
import org.example.objects.*;

import java.util.Comparator;

public class SortWagons implements MenuItem {
    Train train;

    public SortWagons(Train train) {
        this.train = train;
    }

    @Override
    public void execute(){
        if (train == null || train.getWagons().isEmpty()) {
            System.out.println("Поїзда чи вагонів не існує.");
            return;
        }

        train.getWagons().sort(Comparator.comparingInt(Wagon::getComfortLevel).reversed());
        System.out.println("Вагони, посортовані за рівнем комфорту: ");
        train.getWagons().forEach(
                w -> System.out.println("Вагон № " + w.getWagonNumber() + ", рівень комфорту: " + w.getComfortLevel())
        );
    }

    @Override
    public String getName() {
        return "Посортувати вагони на основі рівня комфортності";
    }
}

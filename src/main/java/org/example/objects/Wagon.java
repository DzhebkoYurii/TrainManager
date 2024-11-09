package org.example.objects;

public class Wagon {
    private int comfortLevel;
    private int capacity;
    private int freePlaces;
    private String wagonType;
    private int wagonNumber;

    public Wagon(int comfortLevel, int capacity, int freePlaces, String wagonType, int wagonNumber) {
        this.comfortLevel = comfortLevel;
        this.capacity = capacity;
        this.freePlaces = freePlaces;
        this.wagonType = wagonType;
        this.wagonNumber = wagonNumber;
    }


    public int getComfortLevel() {
        return comfortLevel;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public String getWagonType() {
        return wagonType;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }


    public boolean addPassengers(int count){
        if (this.freePlaces - count >= 0){
            this.freePlaces -= count;
            return true;
        } else {
            System.out.println("Немає місця на стількох пасажирів!");
            System.out.println("Вільних місць: " + freePlaces);
            return false;
        }
    }

    public boolean removePassengers(int count){
        if (this.freePlaces + count <= capacity){
            this.freePlaces += count;
            return true;
        } else {
            System.out.println("Немає стільки пасажирів!");
            System.out.println("Всього пасажирів: " + (capacity - freePlaces));
            return false;
        }
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "рівень комфорту = " + comfortLevel +
                ", кількість місць = " + capacity +
                ", вільні місця = " + freePlaces +
                ", тип вагону = " + wagonType +
                ", номер вагону = " + wagonNumber +
                '}';
    }
}

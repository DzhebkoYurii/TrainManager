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


    public void addPassenger(){
        this.freePlaces++;
    }

    public void addPassengers(int count){
        this.freePlaces += count;
    }

    public void removePassenger(){
        this.freePlaces--;
    }

    public void removePassengers(int count){
        this.freePlaces -= count;
    }
}

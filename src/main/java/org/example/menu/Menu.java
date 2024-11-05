package org.example.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public List<MenuItem> commands  = new ArrayList<MenuItem>();

    public Menu(){}

    public Menu(List<MenuItem> c){
        this.commands=c;
    }

    public void addItem(MenuItem item){
        commands.add(item);
    }

    public void execute(int index){
        if (index <= commands.size()){
            commands.get(index - 1).execute();
        } else if (index - 1 == commands.size()){
            System.out.println("Вихід з програми ...");
        } else {
            System.out.println("Неправильний номер! Спробуйте ще раз!");
        }
    }
}

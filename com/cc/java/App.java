package com.cc.java;

public class App {
    public static void main(String[] args) {
        // Hier wird ausgegeben
        System.out.println("FML");
                
        String food = "noch kein Burger gewählt";
        String drink = "noch kein Drink gewählt";
        String itemNumStr;
        String flag;
        
        System.out.println(food);
        System.out.println(drink);

        //Bestelldialog
        System.out.println("---------------");
        System.out.println("Guten Tag");
        System.out.println("Auswahl: 1 - 2 - 3");
        
        //Eingabe
        itemNumStr = System.console().readLine("Ihre Wahl?:");
        System.out.println(itemNumStr);

        // Zuordnung Zahl -> Burger

        switch (itemNumStr){
            case "1":
                food = "Hamburger";
            break;
            case "2":
                food = "Cheeseburger";
            break;
            case "3":
                food = "Chilliburger";
            break;
            case "4":
                food = "nicht im Sortiment";
            break;
        }
        
        System.out.println(food);
    }
}
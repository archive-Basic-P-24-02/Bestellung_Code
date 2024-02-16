package com.cc.java;

public class App {
    
    public static void main(String[] args) 
    {
        
        // Variablen deklarieren

        String food = "noch kein Burger gewählt";
        String drink = "noch kein Getränk gewählt";
        String itemNumStr;
        String flag;

        System.out.println(food);  
        System.out.println(drink); 

        // Bestelldialog 1 : Ausgabe
        System.out.println("-------------------------------");
        System.out.println("Guten Tag bei MD, Ihre Bestellung bitte!");
        System.out.println("Hamburger(1), Cheeseburger(2) oder Chilliburger(3) ?");

        // Bestelldialog 1 : Eingabe
        itemNumStr = System.console().readLine("Ihre Wahl? : ");
        System.out.println(itemNumStr);  // 1 oder 2 oder 3

        // Zuordnung Zahl --> Burger
        switch (itemNumStr)
        {
            case "1":
                food = "Hamburger";
                break;
            case "2":
                food = "Cheeseburger";
                break;
            case "3":
                food = "Chilliburger";
                break;
        }

        System.out.println(food);


        // Entscheidung Getränk dazu?
        System.out.println("Möchten Sie ein Getränk dazu bestellen? (j/n)");
        flag = System.console().readLine("(j/n)? :");

        System.out.println(flag);

      	 // Getränkeasuwahl
        if (flag.equals("j")) {

            System.out.println("Cola(1) , Fanta(2), Sprite(3)?");
           itemNumStr = System.console().readLine("Ihre Wahl? : ");

            switch (itemNumStr)
            {
                case "1":
                    drink = "Cola" ;
                    break;
                case "2":
                    drink = "Fanta";
                    break;
                case "3":3
                    drink = "Sprite" ;
                    break;
            }

            System.out.println("Hier ist Ihre Bestellung: " +  food + " und " +  drink);

        } else{
            System.out.println("Hier ist Ihre Bestellung: " +  food);
        }

        System.out.println("Vielen Dank, und Auf Wiedersehen!");


    }

}


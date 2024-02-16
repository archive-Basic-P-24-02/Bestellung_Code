package com.cc.java;



public class App {
    
    static String food = "kein Essen";
    static String drink = "kein Getränk";
    static String flag;
    static String itemNum;
  

    public static void main(String[] args) {

        System.out.println("Guten Tag bei MD, Ihre Bestellung bitte!");

        System.out.println("Hamburger(1), Cheeseburger(2) oder Chilliburger(3)?");
        itemNum = System.console().readLine("Eingabe: ");
        System.out.println(itemNum);

        switch (itemNum)
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

        System.out.println("Burger: " + food);

        System.out.println("Möchten Sie ein Getränk dazu bestellen? (j/n)" );
        flag = System.console().readLine("Eingabe: ");
   
        if (flag.equals("j")){

            System.out.println("Cola(1) , Fanta(2), Sprite(3) ?");
            itemNum = System.console().readLine();
    
            switch (itemNum)
            {
                case "1" :
                    drink = "Cola" ;
                    break;
                case "2":
                    drink = "Fanta";
                    break;
                case "3" :
                    drink = "Sprite" ;
                    break;
            }
    

            System.out.println("Hier ist Ihre Bestellung: " + food + " und " + drink);
        } else {
        System.out.println("Hier ist Ihre Bestellung: " + food);
        }
    
        System.out.println("Vielen Dank & Auf Wiedersehen!");
       
    }

  
  
}


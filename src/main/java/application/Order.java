package application;

import java.util.Scanner;

public class Order extends Cake {

    private boolean delivery;

    public static void orderMenu (){
        Scanner scanner = new Scanner(System.in);
        int choose;
        int quantity;

        System.out.println("Welcome in Bakery App!");
        System.out.println("Which cake do you want to order?");
        System.out.println("1. Strawberry-Chocolate Cake");
        System.out.println("2. Cherry Cake");
        System.out.println("3. Forrest-Fruit Cake");
        choose = scanner.nextInt();
        switch (choose) {

            case 1 :
                System.out.println("What size of Strawberry-Chocolate Cake do you want to order?");
                System.out.println("1. Small");
                System.out.println("2. Large");

            case 2 :
                System.out.println("What size of Cherry Cake do you want to order?");
                System.out.println("1. Small");
                System.out.println("2. Large");

            case 3 :
                System.out.println("What size of Forrest Fruit Cake do you want to order?");
                System.out.println("1. Small");
                System.out.println("2. Large");

        }



    }
    public void createOrder(){


    }


}




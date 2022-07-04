package application;

import java.util.Scanner;

public class Cake {

    private CakeTaste cakeTaste;
    private CakeSize cakeSize;
    private double cakePrice;
    private final Scanner scanner = new Scanner(System.in);

    public Cake() {
    }

    public Cake(CakeTaste cakeTaste, CakeSize cakeSize, double cakePrice) {
        this.cakeTaste = cakeTaste;
        this.cakeSize = cakeSize;
        this.cakePrice = cakePrice;
    }


    public double getCakePrice() {
        return cakePrice;
    }

    public void setCakePrice(double cakePrice) {
        this.cakePrice = cakePrice;
    }

    public CakeTaste getCakeTaste() {
        return cakeTaste;
    }

    public void setCakeTaste() {
        int choose;
        choose = scanner.nextInt();
        switch (choose) {
            case 1 -> this.cakeTaste = (CakeTaste.STRAWBERRY_CHOCOLATE);
            case 2 -> this.cakeTaste = (CakeTaste.CHERRY);
            case 3 -> this.cakeTaste = (CakeTaste.FORREST_FRUITS);
        }
    }

    public CakeSize getCakeSize() {
        return cakeSize;
    }

    public void setCakeSize() {
        int choose;

        choose = scanner.nextInt();
        switch (choose) {
            case 1 -> this.cakeSize = (CakeSize.SMALL);
            case 2 -> this.cakeSize = (CakeSize.LARGE);
        }
    }
}

package application;

import java.util.Scanner;

public class Cake {

    private CakeTaste cakeTaste;
    private CakeSize cakeSize;
    private Scanner scanner = new Scanner(System.in);

    public Cake(){
    }

    public Cake(CakeTaste cakeTaste, CakeSize cakeSize) {
        this.cakeTaste = cakeTaste;
        this.cakeSize = cakeSize;
    }

    public CakeTaste getCakeTaste() {
        return cakeTaste;
    }

    public void setCakeTaste() {
        int choose;
        System.out.println("Choose your Cake Taste:");
        System.out.println("1. Strawberry-Chocolate");
        System.out.println("2. Cherry Cake");
        System.out.println("3. Forrest-Fruit Cake");
        choose = scanner.nextInt();
        switch (choose) {
            case 1: this.cakeTaste = (CakeTaste.STRAWBERRY_CHOCOLATE); break;
            case 2: this.cakeTaste = (CakeTaste.CHERRY); break;
            case 3: this.cakeTaste = (CakeTaste.FORREST_FRUITS); break;
        }
    }

    public CakeSize getCakeSize() {
        return cakeSize;
    }

    public void setCakeSize() {
        int choose;
        System.out.println("Choose your Cake Size:");
        System.out.println("1. Small");
        System.out.println("2. Large");
        choose = scanner.nextInt();
        switch (choose) {
            case 1: this.cakeSize = (CakeSize.SMALL); break;
            case 2: this.cakeSize = (CakeSize.LARGE); break;
        }
    }
}

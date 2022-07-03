package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Order extends Cake {

    private boolean delivery;
    private double deliveryPrice;
    private double orderPrice;
    private int quantity;
    private ArrayList<Order> orders = new ArrayList<>();


    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {

        this.delivery = delivery;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order(){
    }

    public Order(CakeTaste cakeTaste, CakeSize cakeSize, boolean delivery) {
        super(cakeTaste, cakeSize);
        this.delivery = delivery;
    }



    public  void orderMenu (){
        Order order = new Order();
        Cake cake = new Cake();
        System.out.println("Welcome in Bakery App!");
        cake.setCakeTaste();
        cake.setCakeSize();
        }

    }

//    public static void createOrder(CakeTaste cakeTaste, CakeSize cakeSize, boolean delivery){
//
//    }

//}


//
//switch (choose) {
//            case 1 :
//                System.out.println("What size of Strawberry-Chocolate Cake do you want to order?");
//                System.out.println("1. Small");
//                System.out.println("2. Large");
//
//                choose = scanner.nextInt();
//                if(choose == 1) {
//                    order.setCakeSize(CakeSize.SMALL);
//                    System.out.println("Quantity:");
//                    order.setQuantity(scanner.nextInt());
//                    System.out.println("wybrałeś " + order.getQuantity());
//                } else if (choose == 2){
//                    order.setCakeSize(CakeSize.LARGE);
//                    System.out.println("Quantity:");
//                    order.setQuantity(scanner.nextInt());
//                } else {
//                    throw new IllegalStateException("Unexpected value: " + choose);
//                    }
//                break;
//
//            case 2 :
//                System.out.println("What size of Cherry Cake do you want to order?");
//                System.out.println("1. Small");
//                System.out.println("2. Large");
//                break;
//            case 3 :
//                System.out.println("What size of Forrest Fruit Cake do you want to order?");
//                System.out.println("1. Small");
//                System.out.println("2. Large");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + choose);


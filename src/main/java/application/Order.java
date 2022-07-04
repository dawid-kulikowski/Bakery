package application;

import java.util.Scanner;

public class Order extends Cake {

    private double deliveryPrice;
    private double orderPrice;
    private int quantity;
    Scanner scanner = new Scanner(System.in);


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = scanner.nextInt();
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Order() {
    }

    public void orderMenu() {
        Order order = new Order();
        System.out.println("Welcome in Bakery App!");
        System.out.println("Choose your Cake Taste:");
        System.out.println("1. Strawberry-Chocolate");
        System.out.println("2. Cherry Cake");
        System.out.println("3. Forrest-Fruit Cake");
        order.setCakeTaste();
        System.out.println("Choose your Cake Size:");
        System.out.println("1. Small");
        System.out.println("2. Large");
        order.setCakeSize();
        System.out.println("Quantity:");
        order.setQuantity();
        order.totalPriceCounter(order);
    }

    private void totalPriceCounter(Order order) {

        int choose;

        double totalPrice = 0;

        if (order.getCakeSize().equals(CakeSize.SMALL)) {
            order.setOrderPrice(order.getCakeTaste().getSmallPrice() * order.getQuantity());
            totalPrice += order.getOrderPrice();

        } else if (order.getCakeSize().equals(CakeSize.LARGE)) {
            order.setOrderPrice(order.getCakeTaste().getLargePrice() * order.getQuantity());
            totalPrice += order.getOrderPrice();

        } else {
            return;
        }

        System.out.println("Delivery:");
        System.out.println("1. Yes (Over 50 km)");
        System.out.println("2. Yes (Closer than 50 km)");
        System.out.println("3. No.");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                if (totalPrice > 200) {
                    order.setDeliveryPrice(20);
                } else {
                    order.setDeliveryPrice(0);
                }
                break;
            case 2:
            case 3:
                order.setDeliveryPrice(0);
                break;
        }
        totalPrice += getDeliveryPrice();


        System.out.println("Your order:");
        System.out.println("Cakes: " + order.getQuantity() + " x " + order.getCakeSize() + " " + order.getCakeTaste().ingredients);
        System.out.println("Delivery Price:" + order.getDeliveryPrice() + " PLN");
        System.out.println("TOTAL PRICE: " + totalPrice + " PLN.");

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


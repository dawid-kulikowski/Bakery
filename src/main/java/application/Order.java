package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order extends Cake {

    private double deliveryPrice;
    private double orderPrice;
    private int quantity;
    private List<Order> fullOrder = new ArrayList<>();
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
        int choose;
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
        fullOrder.add(order);
        System.out.println("Do you Want anything else?");
        choose = scanner.nextInt();
        if (choose == 1){
            orderMenu();
        } else {
            order.totalPriceCounter(order);
        }
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
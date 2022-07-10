package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order extends Cake {

    private double deliveryPrice;
    private double orderPrice;
    private int quantity;
    private int deliveryTime;
    private List<Order> fullOrder = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public int getQuantity() {
        return quantity;
    }
    public int getDeliveryTime() { return deliveryTime; }
    public void setDeliveryTime() { this.deliveryTime =  scanner.nextInt(); }
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
        order.cakePriceCounter(order.getCakeSize());
        System.out.println(order.getCakePrice());
        System.out.println("Quantity:");
        order.setQuantity();
        fullOrder.add(order);
        System.out.println("Do you Want anything else?");
        choose = scanner.nextInt();
        if (choose == 1){
            orderMenu();
        } else {
            totalOrderPrice();
            deliveryPriceCounter();
        }
    }

    public void cakePriceCounter(CakeSize cakeSize){

        if (cakeSize==CakeSize.LARGE) {
            setCakePrice(getCakeTaste().getLargePrice());
        } else if (cakeSize==CakeSize.SMALL){
            setCakePrice(getCakeTaste().getSmallPrice());
        } else {
            return;
        }

    }
    private void totalOrderPrice() {
        double totalOrderPrice = 0;
        int item = 1;
        for (Order order1 : fullOrder) {
            System.out.println("ORDER NUMBER " + item );
            System.out.println(order1.getQuantity() + " x " + order1.getCakeSize() + " " + order1.getCakeTaste().getIngredients());
            order1.setOrderPrice((order1.getCakePrice()*order1.getQuantity()));
            System.out.println("PRICE: " +  order1.getOrderPrice()+"\n");
            totalOrderPrice += order1.getOrderPrice();
            item++;
        }
        System.out.println("TOTAL ORDER PRICE: " + totalOrderPrice);
        setOrderPrice(totalOrderPrice);
        }


        private void deliveryPriceCounter(){
        if (getOrderPrice()>200){
            System.out.println("Shipping Free");
            setOrderPrice(getOrderPrice());
        }

        else {
            setDeliveryPrice(20);
            setOrderPrice(getOrderPrice()+getDeliveryPrice());
        }
            System.out.println("TOTAL ORDER PRICE WITH SHIPPING: " + getOrderPrice());
        }
    }


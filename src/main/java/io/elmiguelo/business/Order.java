package io.elmiguelo.business;

import io.elmiguelo.model.Computer;

public class Order {
    private final int orderId;
    private Computer computer[];
    private static int orderCounter;
    private static final int MAX_COMPUTER = 10;
    private int computerCounter;
    public Order (){
        this.orderId = ++Order.orderCounter;
        computer = new Computer[MAX_COMPUTER];
    }
    public void addComputer(Computer computer){
        if(this.computerCounter < Order.MAX_COMPUTER){
            this.computer[this.computerCounter++] = computer;
        }
        else {
            System.out.println("you have exceeded the limit: " + Order.MAX_COMPUTER);
        }
    }
    public void  shoOrder(){
        System.out.println("Order #:" + this.orderId );
        System.out.println("Order Computers #:" + this.orderId);
        for (Computer c: computer) {
            if(c == null)
                break;

            System.out.println(c);
        }
    }
}

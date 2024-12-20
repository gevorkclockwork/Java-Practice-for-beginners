package day11.task1;

import day11.task2.Warrior;

public class Warehouse {

    private int countPickedOrders;
    private int countDeliveredOrders ;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementPickedOrders() {
        countPickedOrders++;
    }

    public void incrementDeliveredOrders() {
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}


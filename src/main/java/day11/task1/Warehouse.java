package day11.task1;

import day11.task2.Warrior;

public class Warehouse {

    protected int countPickedOrders;
    protected int countDeliveredOrders ;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString() {
        return "Количество собранных заказов: " + countPickedOrders + ", количество доставленных заказов: " + countDeliveredOrders;
    }
}


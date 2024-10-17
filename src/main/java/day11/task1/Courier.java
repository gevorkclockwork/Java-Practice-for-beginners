package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "Заработная плата курьера: " + salary + ", был выплачен бонус или нет: " + isPayed;
    }

    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrders++;
    }

    public void bonus() {
        if (isPayed == false) {
            if (warehouse.countDeliveredOrders == 10000) {
                salary += 50000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }
}
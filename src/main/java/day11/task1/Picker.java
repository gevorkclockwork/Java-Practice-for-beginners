package day11.task1;

public class Picker implements Worker {
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
        return "Заработная плата сборщика: " + salary + ", был выплачен бонус или нет: " + isPayed;
    }

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders++;
    }

    public void bonus() {
        if (isPayed == false) {
            if (warehouse.countPickedOrders == 10000) {
                salary += 70000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }


}

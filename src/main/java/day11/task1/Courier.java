package day11.task1;

public class Courier implements Worker {

    private int salary;
    private boolean isPayed;
    private static final int SUM_SALARY = 100;
    private static final int BONUS = 50_000;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += SUM_SALARY;
        warehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountDeliveredOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        salary += BONUS;
        isPayed = true;
    }

}
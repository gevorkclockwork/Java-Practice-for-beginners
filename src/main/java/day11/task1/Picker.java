package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPayed;
    private static final int SUM_SALARY = 80;
    private static final int BONUS = 70_000;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += SUM_SALARY;
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        salary += BONUS;
        isPayed = true;
    }


}

package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        // СКЛАД 1
        System.out.println("СКЛАД 1");
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(0, false, warehouse);
        Courier courier = new Courier(0, false, warehouse);

        businessProcess(picker);
        System.out.println(warehouse.toString());
        System.out.println(picker.toString());

        businessProcess(courier);
        System.out.println(warehouse.toString());
        System.out.println(courier.toString());

        // СКЛАД 2
        System.out.println();
        System.out.println("СКЛАД 2");
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(0, false, warehouse2);
        Courier courier2 = new Courier(0, false, warehouse2);

        businessProcess(picker2);
        System.out.println(warehouse2.toString());
        System.out.println(picker2.toString());

        businessProcess(courier2);
        System.out.println(warehouse2.toString());
        System.out.println(courier2.toString());

    }

    static void businessProcess (Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}

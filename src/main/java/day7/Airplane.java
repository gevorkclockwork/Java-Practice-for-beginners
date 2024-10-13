package day7;

public class Airplane {
    public String manufacturer;
    public int year;
    public int length;
    public int weight;
    public int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            //System.out.println("Самолет " + airplane1.getManufacturer() + " длиннее");
            System.out.println("Первый самолет длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            //System.out.println("Самолет " + airplane2.getManufacturer() + " длиннее");
            System.out.println("Второй самолет длиннее");
        } else {
            //System.out.println("Длина самолета " + airplane1.getManufacturer() + " равна длина самолета " + airplane2.getManufacturer());
            System.out.println("Длины самолетов равны");
        }
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public int getLength() {
        return length;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}

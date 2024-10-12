package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Camry");
        car.setColor("Red");
        car.setReleaseYear(2024);

        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Release year: " + car.getReleaseYear());
    }
}

class Car {
    private String model;
    private String color;
    private int releaseYear;

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Модель не указана!");
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Цвет не указан!");
        } else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear == 0) {
            System.out.println("Год выпуска не указан!");
        } else {
            this.releaseYear = releaseYear;
        }
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}


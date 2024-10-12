package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("GSX-R 1000", "Green", 2024);
        System.out.println("Model: " + motorbike.getModel());
        System.out.println("Color: " + motorbike.getColor());
        System.out.println("Release year: " + motorbike.getReleaseYear());
    }
}

class Motorbike {
    private String model;
    private String color;
    private int releaseYear;

    public Motorbike(String model, String color, int releaseYear) {
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;
    }

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
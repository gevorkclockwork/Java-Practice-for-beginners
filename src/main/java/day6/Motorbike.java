package day6;

public class Motorbike {
    private String model;
    private String color;
    private int releaseYear;

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        int difference = inputYear - releaseYear;
        if (difference < 0) {
            difference = Math.abs(difference);
        }
        return difference;
    }


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

    public void setYear(int releaseYear) {
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
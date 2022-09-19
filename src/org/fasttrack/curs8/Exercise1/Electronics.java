package org.fasttrack.curs8.Exercise1;

public class Electronics extends Product {
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(double price, String name, String description, int quantity, String type) {
        super(price, name, description, quantity);

        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }


    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void utilizareProdus(String type) {
            System.out.println("Produs uz electronic");
            }
}



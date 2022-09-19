package org.fasttrack.curs8.Exercise1;

public class Fridge extends Electronics{
    private double temperature;

    public Fridge(double price, String name, String description, int quantity, String type, double temperature) {
        super(price, name, description, quantity, type);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void utilizareProdus(String type) {
        System.out.println("Produs de uz electrocasnic");

    }


}

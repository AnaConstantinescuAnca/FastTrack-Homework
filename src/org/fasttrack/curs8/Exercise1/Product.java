package org.fasttrack.curs8.Exercise1;

public abstract class Product {
    private double price;
    private String name;
    private String description;
    private int quantity;

    public Product(double price, String name, String description, int quantity){
        this.price= price;
        this.name = name;
        this.description=description;
        this.quantity=quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void utilizareProdus(){
        System.out.println("Utilizare produs");
    }

    public void utilizareProdus(String type) {
        System.out.println("Produs de uz general");

    }

        public void incarcareStoc(int plusQuantity){
            this.quantity+=plusQuantity;
            System.out.println("Stocul a fost incarcat cu " + plusQuantity +
                    " bucati. In stoc sunt acum  "+ this.quantity + " din produsul " + this.name);
        }
}

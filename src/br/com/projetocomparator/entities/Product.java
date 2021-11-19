package br.com.projetocomparator.entities;

import java.util.Locale;

public class Product implements Comparable<Product> {
    
    private String name;
    private Double price;

    public Product(){

    }


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product p){ //definido a logica de comparacao
        return name.toUpperCase().compareTo(p.getName().toUpperCase());
    }
}
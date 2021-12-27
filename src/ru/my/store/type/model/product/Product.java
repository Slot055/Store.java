package ru.my.store.type.model.product;

import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.shelf.Shelf;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int item;
    private Shelf shelf;
    private PriceList priceList;

    public Product(String name, double price, int item) {
        this.name = name;
        this.price = price;
        this.item = item;
    }


    public Product() {
    }


    public void welcome(Scanner scanner) {

        System.out.println("Встречает продавец консультант");
    }

    public void infoTopProduct() {
        System.out.println("Наименование товара: " + name + "\n" + "Цена: " + price + "\n" + "Артикул: " + item);
    }

    public void choiceProduct() {

        System.out.println("Выбрали товар");
    }


    public void takeFromTheShelf(Shelf shelf) {

        System.out.println("Взяли товар с полки");
    }


    public void putOnTheShelf() {

        System.out.println("Положили товар на полку");
    }

    public void putOnBasket() {

        System.out.println("товар в корзине");
    }

    public void removeFromBasket() {

        System.out.println("Товар удалён из корзины");
    }

    public void buy() {

        System.out.println("Товар куплен");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }
}
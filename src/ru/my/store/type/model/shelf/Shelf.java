package ru.my.store.type.model.shelf;


import ru.my.store.type.model.priceList.PriceList;
import ru.my.store.type.model.product.Product;


public class Shelf {


    private String nameShelf;
    private int maxLot;
    private int lot;
    private int freeSpace;
    private Product product;


    public Shelf(String nameShelf, int maxLot, int lot, int freeSpace) {
        this.nameShelf = nameShelf;
        this.maxLot = maxLot;
        this.lot = lot;
        this.freeSpace = freeSpace;
    }

    public Shelf() {

    }

    public Product[] productOnTheShelf = {new Product(), new Product(), new Product(), new Product(), new Product()};


    public void coming() {
        System.out.println("Приход товара");

    }

    public void outlay() {
        System.out.println("Расход товара");

    }

    public int getMaxLot() {
        return maxLot;
    }

    public void setMaxLot(int maxLot) {
        this.maxLot = maxLot;
    }

    public String getNameShelf() {
        return nameShelf;
    }

    public void setNameProduct(String nameShelf) {
        this.nameShelf = nameShelf;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem1 = new FurnitureItem();
        furnitureItem1.setFurnitureCode(101);
        furnitureItem1.setFurnitureType("table");
        furnitureItem1.setGradeOfFurniture("grade1");
        furnitureItem1.setFurnitureUsage("outdoor");
        furnitureItem1.setPrice(10);

        System.out.println("Discounted price is : $" + furnitureItem1.calculateDiscount());
    }
}

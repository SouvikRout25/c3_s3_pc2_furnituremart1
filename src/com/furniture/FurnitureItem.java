package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private  String furnitureType;
    private String gradeOfFurniture;
    private String furnitureUsage;
    private double price;
    final static int DISCOUNT = 5;

    FurnitureItem(){
        furnitureCode = 0;
        furnitureType = null;
        gradeOfFurniture = null;
        furnitureUsage = null;
        price = 0.0;
    }
    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }
    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }
    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }
    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getFurnitureCode() {
        return furnitureCode;
    }
    public String getFurnitureType() {
        return furnitureType;
    }
    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }
    public String getFurnitureUsage() {
        return furnitureUsage;
    }
    public double getPrice() {
        return price;
    }

    public float calculateDiscount(){
        if(getGradeOfFurniture().equalsIgnoreCase("grade1") && getFurnitureUsage().equalsIgnoreCase("outdoor")){
            return (float)(getPrice() - (getPrice() * DISCOUNT/100));
        }
        return (float)getPrice();
    }
}

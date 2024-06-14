package Письменные_принадлежности_3;

public class WritingMaterials {
    {
        name = "Канцелярская принадлежность";
        color = "золото";
    }

    String name;
    String color;
    int price;
    double length;
    boolean draw;

    public WritingMaterials() {
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
        color = "No Color";
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
        color = "No Color";
        name = "No Name";
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    void display() {
        System.out.println("Название:" + name + ", Цвет:" + color + ", Длина:" + length + ", Цена:" + price + ", Умеет рисовать:" + (draw ? "Да" : "Нет"));
    }

    void replace_rod(String color) {
        this.color = color;
    }

    void priceUp(int price) {
        this.price += price;
    }

    void priceDown(int price) {
        this.price -= price;
    }

    void draw() {
        System.out.println(draw ? name + " провёл линию. Её цвет - " + color : name + " не может ничего нарисовать.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
}

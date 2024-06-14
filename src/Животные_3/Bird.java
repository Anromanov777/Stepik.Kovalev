package Животные_3;

public class Bird extends Animal {
    {
        super.isFly = true;
    }

    String area;
    boolean winterFly;

    public Bird(String type, String name) {
        super(type, name);
    }

    public Bird(String type, int age) {
        super(type, age);
    }

    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwimm) {
        super(type, name, age, weight, isFly, isWalk, isSwimm);
    }

    void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    @Override
    void display() {
        System.out.print("I am " +this.getClass().getSimpleName()+" "+area+" "+winterFly+" ");  super.display();
    }
}

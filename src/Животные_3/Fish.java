package Животные_3;

public class Fish extends Animal {
    {
        super.isSwimm = true;
    }

    String squama;
    boolean upStreamSwim;

    public Fish(String type, String name) {
        super(type, name);
    }

    public Fish(String type, int age) {
        super(type, age);
    }

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwimm) {
        super(type, name, age, weight, isFly, isWalk, isSwimm);
    }

    void bul_bul() {
        System.out.println("Bul-bul");
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    @Override
    void display() {
        System.out.print("I am " +this.getClass().getSimpleName()+" "+squama+" "+upStreamSwim+" ");  super.display();
    }
}

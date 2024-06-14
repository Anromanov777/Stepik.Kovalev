package Животные_3;

public class Animal {

    {
        name = "Безымянное животное";
        count++;
    }

    public static String description = "Это описание класса Животное";
    private static int count;
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwimm;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.name = "No Name";
        this.age = age;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwimm) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwimm = isSwimm;
    }

    public static void opisanie() {
        System.out.println("Я животное!");
    }

    void display() {
        System.out.println("Тип:" + type + ", Имя:" + name + ", Возраст:" + age + ", Вес:" + weight + ", Умеет летать:" + isFly + ", Умеет ходить:" + isWalk + ", Умеет плавать:" + isSwimm);
    }

    public void rename(String name) {
        this.name = name;
    }

    void holiday(int day) {
        weight += day * 0.1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwimm() {
        return isSwimm;
    }

    public void setSwimm(boolean swimm) {
        isSwimm = swimm;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "count="+count+
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isFly=" + isFly +
                ", isWalk=" + isWalk +
                ", isSwimm=" + isSwimm +
                '}';
    }
}

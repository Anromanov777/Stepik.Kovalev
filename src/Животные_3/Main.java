package Животные_3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Кот", 5);
        Fish fish = new Fish("Карась", 1);
        System.out.println(Animal.description);
        Animal.opisanie();
        System.out.println(animal);
        System.out.println(fish);
        System.out.println(animal);
    }
}

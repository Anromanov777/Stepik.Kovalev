package Письменные_принадлежности_3;

public final class Ruler extends WritingMaterials {
    {
        super.draw = false;
    }

    int lenght;
    boolean wood;

    void measure() {
        System.out.println("Сейчас померяем длину");
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }
    @Override
    void display() {
        System.out.print("This is "+this.getClass().getSimpleName()+", Длина:"+lenght+", Линейка из дерева?:"+(wood?"да, ":"нет, ")); super.display();
    }
}

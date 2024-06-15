package Абстракция_зданий;

public class University extends Building{
    int windows;
    int doors;

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return
                "windows=" + windows +
                ", doors=" + doors +
                super.toString();
    }
}

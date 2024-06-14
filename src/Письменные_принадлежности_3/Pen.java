package Письменные_принадлежности_3;

public class Pen extends WritingMaterials {
    {
        super.draw = true;
    }

    int countColor = 1;
    boolean auto;

    void writeMyName() {
        System.out.println("Андрей");
    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }
}

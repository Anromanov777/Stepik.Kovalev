package Письменные_принадлежности_3;

public class Divider extends WritingMaterials {
    {
        super.draw = false;
    }

    String dividerType;
    boolean metal;

    void draw_circle() {
        System.out.println("Нарисован круг");
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }
    @Override
    void display() {
        System.out.print("This is "+this.getClass().getSimpleName()+", Тип циркуля:"+dividerType+", Циркуль из металла?:"+(metal?"да, ":"нет, ")); super.display();
    }
}

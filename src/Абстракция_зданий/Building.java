package Абстракция_зданий;

public abstract class Building {
  private   String name;
  private   String adres;
  private   int god;
  private   String arhitektor;
  private   boolean is_Pamiatnik;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", adres='" + adres + '\'' +
                ", god=" + god +
                ", arhitektor='" + arhitektor + '\'' +
                ", is_Pamiatnik=" + is_Pamiatnik;
    }
}

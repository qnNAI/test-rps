package tableware;

public class Pot implements Object, Tableware{

    String fabricator;
    String style;
    final String name = "кастрюля";
    double price;
    double volume;
    boolean has_cap;

    public Pot(String fabricator, String style, double price, double volume) {
        this.fabricator = fabricator;
        this.style = style;
        this.price = price;
        this.volume = volume;
        has_cap = true;
    }

    public Pot(String fabricator, String style, double price, double volume, boolean has_cap) {
        this.fabricator = fabricator;
        this.style = style;
        this.price = price;
        this.volume = volume;
        this.has_cap = has_cap; }

    public Pot() {
        fabricator = "not selected";
        style = "not selected";
        price = 0;
        volume = 0;
        has_cap = false;
    }

    @Override
    public String toString() {
        return "Pot{" +
                "fabricator='" + fabricator + '\'' +
                ", style='" + style + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", has_cap=" + has_cap +
                '}';
    }

    public String getFabricator() {
        return fabricator;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public boolean isHas_cap() {
        return has_cap;
    }


/*  @Override
    public String toString() {
        return "Pot{" +
                "fabricator='" + fabricator + '\'' +
                ", style='" + style + '\'' +
                ", name=кастрюля '" + name +'\'' +
                ", price=" + price +
                '}';
    }

    public Pot() {
        fabricator = "not selected";
        style = "not selected";
        name = "not selected";
        price = 0;
    }

    public Pot(String fabricator, String style,  String name) {
        this.fabricator = fabricator;
        this.style = style;
        this.name = name;
        price = 0;
    }

    public Pot(String fabricator,  String style,  String name, double price) {
        this.fabricator = fabricator;
        this.price = price;
        this.style = style;
        this.name = name;
    }

    public String getFabricator() {
        return fabricator;
    }

    public double getPrice() {
        return price;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }*/

    public void print()
    {
        System.out.println(toString());
    }

    public void print_name()
    {
        System.out.println("Наименование - кастрюля " + name);
    }




}

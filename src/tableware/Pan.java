package tableware;

public class Pan implements Object, Tableware {

    String fabricator;
    String style;
    final String name = "сковорода";
    double price;
    double handle_length;
    boolean coating;

    public Pan(String fabricator, String style, double price, double handle_length, boolean coating) {
        this.fabricator = fabricator;
        this.style = style;
        this.price = price;
        this.handle_length = handle_length;
        this.coating = coating;
    }

    public Pan(String fabricator, String style, double price, double handle_length) {
        this.fabricator = fabricator;
        this.style = style;
        this.price = price;
        this.handle_length = handle_length;
        coating = true;
    }

    public Pan() {
        fabricator = "not selected";
        style = "not selected";
        price = 0;
        handle_length = 0;
        coating = false;
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

    public double getHandle_length() {
        return handle_length;
    }

    public boolean isCoating() {
        return coating;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "fabricator='" + fabricator + '\'' +
                ", style='" + style + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", handle_length=" + handle_length +
                ", coating=" + coating +
                '}';
    }

    /*  @Override
    public String toString() {
        return "Pot{" +
                "fabricator='" + fabricator + '\'' +
                ", style='" + style + '\'' +
                ", name=сковорода '" + name +'\'' +
                ", price=" + price +
                '}';
    }

    public Pan() {
        fabricator = "not selected";
        style = "not selected";
        name = "not selected";
        price = 0;
    }

    public Pan(String fabricator, String style,  String name) {
        this.fabricator = fabricator;
        this.style = style;
        this.name = name;
        price = 0;
    }

    public Pan(String fabricator,  String style,  String name, double price) {
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
        System.out.println("Наименование - сковорода " + name);
    }

}

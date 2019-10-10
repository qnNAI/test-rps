package tableware;

public abstract class Plate implements Object, Tableware{

    protected String fabricator;
    protected String style;
    protected String name;
    protected double price;

    public Plate() {
        fabricator = "not selected";
        style = "not selected";
        price = 0;
    }

    public Plate(String fabricator, String style) {
        this.fabricator = fabricator;
        this.style = style;
        price = 0;
    }

    public Plate(String fabricator,  String style, double price) {
        this.fabricator = fabricator;
        this.price = price;
        this.style = style;
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

    abstract public String getName();

    @Override
    abstract  public String toString();


}

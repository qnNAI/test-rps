package tableware;

public class Saucer extends Plate {

    public Saucer() {
        super();
    }

    public Saucer(String fabricator, String style) {
        super(fabricator, style);
        super.name = "блюдце";
    }

    public Saucer(String fabricator, String style, double price) {
        super(fabricator, style, price);
        super.name = "блюдце";
    }

    @Override
    public String toString() {
        return "Salad_bowl{" +
                "fabricator='" + fabricator + '\'' +
                ", style='" + style + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void print()
    {
        System.out.println(toString());
    }

    public void print_name()
    {
        System.out.println("Наименование - блюдце " + name);
    }

    @Override
    public String getName()
    {
        return "блюдце";
    }
}

package tableware;

public class Salad_bowl extends Plate {

    public Salad_bowl() {
        super();
    }

    public Salad_bowl(String fabricator, String style) {
        super(fabricator, style);
        super.name = "салатница";
    }

    public Salad_bowl(String fabricator, String style, double price) {
        super(fabricator, style, price);
        super.name = "салатница";
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

    public void print_name()  { System.out.println("Наименование - салатница " + name); }

    @Override
    public String getName()
    {
       return "салатница";
    }
}

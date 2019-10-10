package main;
import tableware.*;
import tableware.Object;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String args[])
    {

        ArrayList<Object> tbl = new ArrayList<>();

        tbl.add(new Pan("Tefal", "современный стиль", 15, 30));
        tbl.add(new Pot("TalleR", "минимализм", 20, 2));
        tbl.add(new Salad_bowl("Gastro", "Ваби-саби", 7));
        tbl.add(new Saucer("Jahami", "универсальный стиль", 3));

        Iterator<Object> it =tbl.iterator();

        while (it.hasNext())
        {
            it.next().print();
        }

    }
}

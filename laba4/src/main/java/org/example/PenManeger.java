package org.example;

import java.util.ArrayList;
import java.util.List;

public class PenManeger {
    public  List<Pen> pencilcase = new ArrayList();
    public void addPen(Pen pen) {
        pencilcase.add(pen);
    }

    public  List<Pen> findAllYellowPencilcases(){
        return pencilcase.stream().filter(pen -> pen.getColor() == "yellow").toList();
    }
    public   List<Pen> findPencilcaseWithBrandKite(){
        return pencilcase.stream().filter(pen -> pen.getBrand() == "Kite").toList();
    }

}

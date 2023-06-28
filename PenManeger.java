package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PenManeger {
    static List<Pen> pencilcase = new ArrayList();
    public void addPen(Pen pen) {
        pencilcase.add(pen);
    }

    public static List<Pen> findAllYellowPencilcases(String color){
        return pencilcase.stream().filter(pen -> pen.getColor() == "yellow").toList();
    }
    public static  List<Pen> findPencilcaseWithBrandKite(String brand){
        return pencilcase.stream().filter(pen -> pen.getBrand() == "Kite").toList();
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        PenManeger penManeger = new PenManeger();

        penManeger.addPen(new SchoolPen("lgtp-54","Big","brown","cloth",11,2,3,1));
        penManeger.addPen(new SchoolPen("rs-44","Kite","yellow","cloth",13,2,2,1));
        penManeger.addPen(new MarkerPen("gpt-4", "Winstone","green","plastic",11,7,"highlighter"));
        penManeger.addPen(new MarkerPen("wep3","Camel","purple","plastic",11,11,"for drowing"));
        penManeger.addPen(new FeatherPen("vbnl56","Kite","black","feather", 20,"ostrich's feather","octopus' ink",2));
        penManeger.addPen(new FeatherPen("klot-666","Big","black","feather",21,"chiken's feather", "octopus' ink",3));
        penManeger.addPen(new OilPen("fhr-2","Marlboro","blue","metallic",14,"Oleyna",3));
        penManeger.addPen(new OilPen("tgr44","Parlament","black","mettalic",15,"olive oil",4));

        for(Pen lists: PenManeger.pencilcase){
            System.out.println(lists);
            lists.calculatePrice();
        }

        var pencilcaseToFound1 = PenManeger.findAllYellowPencilcases("yellow");
        System.out.println("Yellow pencilcase is - ");
        for (Pen pen : pencilcaseToFound1){
            System.out.println(pen);
        }

        var pencilcaseToFound2 = PenManeger.findPencilcaseWithBrandKite("Kite");
        System.out.println("Kite's pencilcase is - ");
        for (Pen pen : pencilcaseToFound2){
            System.out.println(pen);
        }


    }


}

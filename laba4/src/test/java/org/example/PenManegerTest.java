package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PenManegerTest {
    @Test

    void testAddPen(){
        PenManeger penManeger = new PenManeger();
        penManeger.addPen(new FeatherPen());
        penManeger.addPen(new OilPen());
        penManeger.addPen(new SchoolPen());
        penManeger.addPen(new MarkerPen());
        assertEquals(4,penManeger.pencilcase.size());
    }
    @Test
    void findAllYellowPencilcases(){
        var penManeger = new PenManeger();
        penManeger.addPen(new SchoolPen("rs-44","Kite","yellow","cloth",13,2,2,1));
        penManeger.addPen(new MarkerPen("wep3","Camel","purple","plastic",11,11,"for drowing"));
        penManeger.addPen(new FeatherPen("klot-666","Big","black","feather",21,"chiken's feather", "octopus' ink",3));
        penManeger.addPen(new OilPen("tgr44","Parlament","black","mettalic",15,"olive oil",4));
        List<Pen> yellowPencilcases = penManeger.findAllYellowPencilcases();
        assertEquals(1, yellowPencilcases.size());

    }
    @Test
    void findPencilcaseWithBrandKite(){
        var penManeger = new PenManeger();
        penManeger.addPen(new SchoolPen("rs-44","Kite","yellow","cloth",13,2,2,1));
        penManeger.addPen(new MarkerPen("wep3","Camel","purple","plastic",11,11,"for drowing"));
        penManeger.addPen(new FeatherPen("klot-666","Big","black","feather",21,"chiken's feather", "octopus' ink",3));
        penManeger.addPen(new OilPen("tgr44","Parlament","black","mettalic",15,"olive oil",4));
        List<Pen> kitePencilcases = penManeger.findPencilcaseWithBrandKite();
        assertEquals(1, kitePencilcases.size());
    }

}
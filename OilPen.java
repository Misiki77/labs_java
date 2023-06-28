package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)

public class OilPen extends Pen{
    public String oil_type;
    public int numOilPen;
    public final int oil_pen_price_in_gryvnias = 55;

    public OilPen(String id, String brand, String color, String material, int size,String oil_type, int numOilPen){
        super(id, brand, color, material, size);
        this.oil_type = oil_type;
        this.numOilPen = numOilPen;
    }

    @Override
    public void calculatePrice() {
        int price;
        price = oil_pen_price_in_gryvnias*numOilPen;
        System.out.println(price+"uah");
    }

}

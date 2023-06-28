package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)

public class FeatherPen extends Pen{
    public String feather_type;
    public String ink_type;
    public int numFeatherPens;
    public final int feather_pen_price_in_gryvnias = 40;

    public FeatherPen(String id, String brand, String color, String material, int size,String feather_type,String ink_type,int numFeatherPens){
        super(id, brand, color, material, size);
        this.feather_type = feather_type;
        this.ink_type = ink_type;
        this.numFeatherPens = numFeatherPens;
    }
    @Override
    public void calculatePrice() {
        int price;
        price = feather_pen_price_in_gryvnias*numFeatherPens;
        System.out.println(price+"uah");
    }

}

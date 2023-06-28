package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@NoArgsConstructor
@Setter

public class OilPen extends Pen{
    public String oilType;
    public int numOilPens;
    public final int oilPenPriceInGryvnias = 55;

    public OilPen(String id, String brand, String color, String material, int size, String oilType, int numOilPens){
        super(id, brand, color, material, size);
        this.oilType = oilType;
        this.numOilPens = numOilPens;
    }

    @Override
    public void calculatePrice() {
        int price = oilPenPriceInGryvnias * numOilPens;
    }

    public String getHeaders(){
        return super.getHeaders()+" oilType"+","+" numOilPens"+","+" oilPenPriceInGryvnias";
    }
    public String toCSV(){
        return super.toCSV()+", "+oilType+", "+numOilPens+", "+oilPenPriceInGryvnias;
    }
    public String getTitle(){
        return "OilPen";
    }

}

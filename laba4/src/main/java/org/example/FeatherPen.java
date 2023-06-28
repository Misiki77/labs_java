package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString(callSuper = true)
@NoArgsConstructor
@Getter
@Setter

public class FeatherPen extends Pen {
    public String featherType;
    public String inkType;
    public int numFeatherPens;
    public final int featherPenPriceInGryvnias = 40;

    public FeatherPen(String id, String brand, String color, String material, int size, String featherType, String ink_type, int numFeatherPens){
        super(id, brand, color, material, size);
        this.featherType = featherType;
        this.inkType = ink_type;
        this.numFeatherPens = numFeatherPens;
    }
    @Override
    public void calculatePrice() {
        int price = featherPenPriceInGryvnias *numFeatherPens;
    }

    public String getHeaders(){
        return super.getHeaders()+" feather_type"+","+" ink_type"+","+" numFeatherPens"+","+" featherPenPriceInGryvnias";
    }
    public String toCSV(){
        return super.toCSV()+", "+featherType+", "+inkType+", "+numFeatherPens+", "+featherPenPriceInGryvnias;
    }
    public String getTitle(){
        return "FeatherPen";
    }

}

package org.example;

import lombok.ToString;

@ToString(callSuper = true)
public class MarkerPen extends Pen {
    public int numMarkers;
    public String marker_type;
    public final int marker_price_in_gryvnias = 23;

    public MarkerPen(String id, String brand, String color, String material, int size, int numMarkers, String marker_type) {
        super(id, brand, color, material, size);
        this.numMarkers = numMarkers;
        this.marker_type = marker_type;
    }

    @Override
    public void calculatePrice() {
        int price;
        price = marker_price_in_gryvnias * numMarkers;
        System.out.println(price + "uah");
    }


}

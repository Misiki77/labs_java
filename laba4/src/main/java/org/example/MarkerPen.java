package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@NoArgsConstructor
@Setter
public class MarkerPen extends Pen {
    public int numMarkers;
    public String markerType;
    public final int markerPriceInGryvnias = 23;

    public MarkerPen(String id, String brand, String color, String material, int size, int numMarkers, String markerType) {
        super(id, brand, color, material, size);
        this.numMarkers = numMarkers;
        this.markerType = markerType;
    }

    @Override
    public void calculatePrice() {
        int price = markerPriceInGryvnias * numMarkers;
    }

    public String getHeaders(){
        return super.getHeaders()+" numMarkers"+","+" markerType"+","+" markerPriceInGryvnias";
    }
    public String toCSV(){
        return super.toCSV()+", "+numMarkers+", "+markerType+", "+markerPriceInGryvnias;
    }
    public String getTitle(){
        return "MarkerPen";
    }


}

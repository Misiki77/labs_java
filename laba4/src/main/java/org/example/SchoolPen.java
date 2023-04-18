package org.example;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class SchoolPen extends Pen {

    private int numPencils;
    private int numPens;
    private int numErasers;

    private final int pencilsPriceInGryvnias = 7;
    private final int penPriceInGryvnias = 15;
    private final int eraserPriceInGryvnias = 10;

    private static SchoolPen instance = new SchoolPen();

    public void addPen() {
            numPens++;
    }
    public void addPencil(){
        numPencils++;
    }
    public void removePen(){
        numPens--;
    }
    public void removePencils(){numPencils--;}
    public SchoolPen(String id, String brand, String color, String material, int size, int numPencils,int numPens,int numErasers){
        super(id, brand, color, material, size);
        this.numPencils = numPencils;
        this.numPens = numPens;
        this.numErasers = numErasers;
    }

    @Override
    public void calculatePrice() {
       int price = pencilsPriceInGryvnias * numPencils + penPriceInGryvnias * numPens + eraserPriceInGryvnias + numErasers;
    }

    public String getHeaders(){
        return super.getHeaders()+" numPens"+","+" numPencils"+","+" numErasers"+","+" pencilsPriceInGryvnias"+","+" penPriceInGryvnias"+","+" eraserPriceInGryvnias";
    }
    public String toCSV(){
        return super.toCSV()+", "+numPens+", "+numPencils+", "+numErasers+", "+penPriceInGryvnias+", "+pencilsPriceInGryvnias+", "+eraserPriceInGryvnias;
    }
    public String getTitle(){
        return "SchoolPen";
    }
}

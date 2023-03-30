package ua.lviv.iot.algo.part1.lab1;
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

    private final int Pencils_price_in_gryvnias = 7;
    private final int Pen_price_in_gryvnias = 15;
    private final int Eraser_price_in_gryvnias = 10;

    private static SchoolPen instance = new SchoolPen();
    public static SchoolPen getInstance(){
        return  instance;
    }

    public void addPen(SchoolPen schoolPen) {
            numPens++;
    }
    public void addPencil(){
        numPencils++;
    }
    public void removePen(){
        numPens--;
    }
    public void removePencils(){
        numPencils--;
    }

    public SchoolPen(String id, String brand, String color, String material, int size, int numPencils,int numPens,int numErasers){
        super(id, brand, color, material, size);
        this.numPencils = numPencils;
        this.numPens = numPens;
        this.numErasers = numErasers;
    }

    @Override
    public void calculatePrice() {
        int price;

        price = Pencils_price_in_gryvnias * numPencils + Pen_price_in_gryvnias * numPens + Eraser_price_in_gryvnias + numErasers;
        System.out.println(price+"uah");
    }
}
